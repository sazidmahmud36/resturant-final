import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Bill } from 'src/app/model/bill';
import { BillDes } from 'src/app/model/bill-des';
import { Booking } from 'src/app/model/booking';
import { Customer } from 'src/app/model/customer';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent {

  booking:any;
  templete:any = "order";
  allTableInfo:any = [];
  sit:any=[];
  allfreeTable:any=[];
  bookingTime:any = "Select Time";
  tableTemplate:any;

  // customer table
  customerId:any;
  customerName:any;
  customerPhone:any;

// booking table
  bookingId:any;
  tableNo:any;
  bookingStatus:any;
  date:any;
  orderId:any;

  // bill table
  bill:any;
  // billId:any;
  totalBill:any=0;
  // paid:any;
  // due:any;
  // billStatus:any;

  // Bill Desc
  desId:any;
  tableNumber:any;
  foodId:any; 
  amount:any;

  // food Item
  
	 foodName: any;
	 foodPrice: any;

  orderQuantity:any = 1;
                    

   food:any;
   billFood:any = {desId: 0, billId: 0,tableNumber: 0,foodId: 0,orderQuantity:0,amount: 0,totalprice:0};
   allFood:any[] = [];
   getAllfood:any;
   showFoods:any[]=[];
   showFood:any={tableNumber: 0,foodName: "",quantity:0,amount: 0,total:0};

  //(desId:any, billId:any,tableNumber:any,foodId:any, quantity:any, amount:any,total:any)
  //(billId: any,customerId: any,date: any,totalBill: any,paid: any,due: any,billStatus: any)

   foodAddToArray(foodID:any,foodName:any,foodPrice:any,){
    this.billFood = new Object();
    this.billFood.desId=1;
    this.billFood.billId=this.bill.billId;
    this.billFood.tableNumber=this.tableNumber;
    this.billFood.foodId=foodID;
    this.billFood.orderQuantity=this.orderQuantity;
    this.billFood.amount=foodPrice;
    this.billFood.totalprice=this.orderQuantity*foodPrice;
    this.allFood.push(this.billFood);
    // alert("Food Id : "+this.billFood.foodId);
    // alert("Order Quantity : "+this.billFood.orderQuantity);
    // alert("Total Price : "+this.billFood.totalprice);

    this.showFood=new Object();
    this.showFood.tableNumber=this.tableNumber;
    this.showFood.foodName=foodName;
    this.showFood.quantity=this.orderQuantity;
    this.showFood.amount=foodPrice;
    this.showFood.total=parseInt(this.orderQuantity)*foodPrice;
    this.showFoods.push(this.showFood);
    this.food=null;
   }



   addTableNo(i:any){
    this.tableNumber=this.allTableInfo[i].tableNumber;
   }

   bookingid:any;
   bookingData:any;
  
   //=========================Constructor==================================

   constructor(private myservice: ControllerService, private router:Router){
    this.myservice.getAllTable().subscribe((x) =>{this.allTableInfo = x});
    this.myservice.getAllFood().subscribe((x) => {this.getAllfood = x});


    this.bookingid=this.router.getCurrentNavigation()?.extras.state?.["bookingId"];
    // alert(this.bookingid);
    this.myservice.bookingDataById(this.bookingid).subscribe((x)=>{
      this.bookingData=x;
      this.customerId=this.bookingData.customerId;
      this.date=this.bookingData.date;
      this.tableNumber=this.bookingData.tableNo;


      this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
        this.bill=x;
      });
    })

    this.myservice.getAllTableSit().subscribe((x)=>{this.sit=x});
    this.customerId=this.router.getCurrentNavigation()?.extras.state?.["CustomerId"];
    this.tableNumber=this.router.getCurrentNavigation()?.extras.state?.["TableNo"];
    this.date=this.router.getCurrentNavigation()?.extras.state?.["Date"];
    this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
      this.bill=x;
      // this.billId=this.bill.billId
    });
    
    
  }

   //=========================Constructor Close==================================




  tableFare:any;
  tableQuantity:any;
  newCustomer: any;
  newBooking:any;
  newBill:any;
  bilDes:any;

  
  foodSearch(){
    this.orderQuantity=1;
    this.myservice.getFoodById(this.foodId).subscribe((x) => {this.food = x})
    this.foodId=null;
  }

  confirmOrder(){

  }


  calculate(){
    if(this.totalBill == 0){
      for(let i of this.allFood){

        this.totalBill=this.totalBill+i.totalprice;
        // alert("Total Bill : "+this.totalBill+" Bill Id : "+i.billId);
        
      }
    }else{
        // alert ("Bill calculated");
    }
   
  }

  procideToPay(){
    // alert("Before Process total bill : "+this.bill.totalBill);

      this.bill.totalBill=this.bill.totalBill+this.totalBill;
    this.bill.paid=0;
    this.bill.due=this.bill.totalBill-this.bill.paid;
    // alert("After Process total bill : "+this.bill.totalBill);
    this.myservice.updateBill(this.bill).subscribe(()=>{
      // alert("Bill Updated")
      this.myservice.foodBillDes(this.allFood).subscribe(()=>{
      this.router.navigateByUrl("/admin/payment",{state:{bookingId:this.bookingid}});
      })
    })
    
  }
  

}

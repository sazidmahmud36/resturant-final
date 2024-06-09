import { state } from '@angular/animations';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Bill } from 'src/app/model/bill';
import { BillDes } from 'src/app/model/bill-des';
import { Booking } from 'src/app/model/booking';
import { Customer } from 'src/app/model/customer';
import { TableInfo } from 'src/app/model/table-info';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-table-booking',
  templateUrl: './table-booking.component.html',
  styleUrls: ['./table-booking.component.css']
})
export class TableBookingComponent {


  booking:any=[];
  templete:any = "Booking";
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
  bookingStatus:any="Select Booking Status";
  date:any;
  orderId:any;

  // bill table

  billId:any;
  totalBill:any;
  paid:any;
  due:any;
  billStatus:any;

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
   billFood:any = {desId: 0, billId: 0,tableNumber: 0,foodId: 0,quantity:0,amount: 0,total:0};
   allFood:any[] = [];
   showFoods:any[]=[];
   showFood:any={tableNumber: 0,foodName: "",quantity:0,amount: 0,total:0};



   foodAddToArray(foodID:any,foodName:any,foodPrice:any,){
    this.billFood = new Object();
    this.billFood.desId=1;
    this.billFood.billId=0;
    this.billFood.tableNumber=this.tableNumber;
    this.billFood.foodId=foodID;
    this.billFood.quantity=this.orderQuantity;
    this.billFood.amount=foodPrice;
    this.billFood.total=this.orderQuantity*foodPrice;
    this.allFood.push(this.billFood);


    this.showFood=new Object();
    this.showFood.tableNumber=this.tableNumber;
    this.showFood.foodName=foodName;
    this.showFood.quantity=this.orderQuantity;
    this.showFood.amount=foodPrice;
    this.showFood.total=parseInt(this.orderQuantity)*foodPrice;
    this.showFoods.push(this.showFood);
   }



   addTableNo(i:any){
    this.tableNumber=this.allTableInfo[i].tableNumber;
   }

  constructor(private myservice: ControllerService, private router:Router){
    // this.myservice.getAllTable().subscribe((x) =>{this.allTableInfo = x});
    this.myservice.showAllAvailableTable().subscribe((x) =>{this.allTableInfo = x});
    this.myservice.getAllTableSit().subscribe((x)=>{this.sit=x});
    
  }

  findBookingById(){
    this.myservice.getAllbookingByDate(this.date,this.bookingStatus).subscribe((x)=>{
      this.booking=x;
      // alert("find booking works")
    })
  }

  ordertemplate:any;
  getOrder(bookingId:any){
    // this.ordertemplate="order";
    this.router.navigateByUrl("/admin/order",{state:{bookingId:bookingId}});
    // this.router.navigateByUrl("/admin/order",{state:{templete:this.ordertemplate}});
  }

  procideToPayment(bookingId:any){
    this.router.navigateByUrl("/admin/payment",{state:{bookingId:bookingId}});
  }

  findFreeTable(){
    this.tableTemplate = "table";
    this.myservice.getAllFreeTable(this.bookingTime).subscribe((x) => {this.allfreeTable = x});
    
  }



  tableFare:any;
  tableQuantity:any;
  newCustomer: any;
  newBooking:any;
  newBill:any;
  bilDes:any;
  updateTable:any;

  bookTable(){
    this.newCustomer = new Customer(this.customerId,this.customerName,this.customerPhone);
    this.myservice.findCreateCustomer(this.newCustomer).subscribe((x) => {
      // alert("Customer Subscribe works");
      this.customerId = x.customerId;
      // alert(this.customerId);
      //bookingId: any,tableNo: any,customerId: any,bookingTime: any,bookingStatus: any,date: any,orderId: any
      this.newBooking = new Booking(this.bookingId,this.tableNo,this.customerId,this.bookingTime, this.bookingStatus,this.date,this.orderId);
      this.myservice.newBooking(this.newBooking).subscribe(() => {alert("Booking Succesful!")});
      this.totalBill=this.tableFare;
      this.billStatus="due";
      this.newBill= new Bill(this.billId,this.customerId,this.date,this.totalBill,this.paid,this.due,this.billStatus);
      this.myservice.newBill(this.newBill).subscribe((x)=>{
        this.billId=x.billId
        // alert("Bill Id : "+this.billId);
        this.bilDes=new BillDes(this.desId,this.billId,this.tableNo,this.foodId,this.tableQuantity,this.tableFare,this.totalBill);
      this.myservice.tableBillDes(this.bilDes).subscribe(()=>{
        // alert("Bill Des bill id: "+this.bilDes.billId)
        // alert("Bill Des Added")
        this.templete=="bookingList";
      })
      });

      
      this.updateTable = new TableInfo(null,this.tableNo,null,null,null,null,'Booked');
      this.myservice.updateTableStatus(this.updateTable).subscribe(() => {
        this.myservice.showAllAvailableTable().subscribe((x) =>{this.allTableInfo = x});
      });
    });

  }



  processBooking(tableNo:any, fare: any){
    // this.templete = null;
    this.tableNo = tableNo;
    this.tableFare = fare;
    this.bookingStatus = "booked";

    this.tableTemplate = "bTable";
  }

  foodSearch(){
    this.myservice.getFoodById(this.foodId).subscribe((x) => {this.food = x});
  }



  confirmOrder(){

  }


  calculate(){

  }
  
}

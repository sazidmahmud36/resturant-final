import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Bill } from 'src/app/model/bill';
import { BillDes } from 'src/app/model/bill-des';
import { Booking } from 'src/app/model/booking';
import { Customer } from 'src/app/model/customer';
import { Payment } from 'src/app/model/payment';
import { TableInfo } from 'src/app/model/table-info';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.css']
})
export class PaymentsComponent {
  bookingData:any;
bookingid:any;
 bill:any;

bills:any=[];
customerId:any;
tableNumber:any;
date:any;

transectionId:any;
paymentType:any="cash payment";
grossSale:any =0;
paymentStatus:any;
Discount:any=0;
netSale:any=0;
payAmmount:any=0;
return:any=0;


  constructor(private myservice: ControllerService, private router:Router){
    // this.customerId=this.router.getCurrentNavigation()?.extras.state?.["customerid"];
    // this.tableNumber=this.router.getCurrentNavigation()?.extras.state?.["tableno"];
    // this.date=this.router.getCurrentNavigation()?.extras.state?.["date"];
    this.bookingid=this.router.getCurrentNavigation()?.extras.state?.["bookingId"];
    // alert(this.bookingid);
    this.myservice.bookingDataById(this.bookingid).subscribe((x)=>{
      this.bookingData=x;
      this.customerId=this.bookingData.customerId;
      this.date=this.bookingData.date;


      this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
        this.bill=x;
      });
    })
    
    if(this.customerId == null){
      // this.customerId=this.bookingData.customerId;
      // this.date=this.bookingData.date;
    
      this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
        this.bill=x;
      });
    }else{
    //   this.customerId=this.bookingData.customerId;
    // this.date=this.bookingData.date;
    
      this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
        this.bill=x;});
      // this.bill=this.router.getCurrentNavigation()?.extras.state?.["bill"];
      
    }
    

    // this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{
    //   this.bill=x;
      
    // });


  }


 calculate(){
  // (this.grossSale*this.Discount/100);
  this.netSale=this.grossSale-this.Discount;
  this.return=this.payAmmount-this.netSale;
 }
//  (paymentId: any,date: any,billId: any,customerId: any,amount: any,paymentType: any) 
payment:any;
tableInfo:any;
 paymentConfirm(){
  if(this.paymentStatus!="paid"){
    this.bill.paid=this.bill.totalBill;
  this.bill.due=this.bill.totalBill-this.bill.paid;
  this.bill.billStatus="paid";
  this.tableInfo = new TableInfo(0,this.tableNumber, null, null, null,null, "available");
  this.payment=new Payment(0,this.bill.date,this.bill.billId,this.bill.customerId,this.bill.totalBill,this.paymentType);
  this.myservice.savetransection(this.payment).subscribe(()=>{
    // alert("Save Transection");
    this.myservice.updateTableStatus(this.tableInfo).subscribe(() => {
      // alert("Table update to available")
      this.myservice.updateBill(this.bill).subscribe(() => { 
        // alert("bill Update");
        this.myservice.updateBookingStatus(this.bookingid).subscribe(()=>{
          this.router.navigateByUrl("/printbill",{state:{bills:this.bills,bill:this.bill,payAmmount:this.payAmmount,return:this.return}});
        });
      });
    });
    
    

    
    
  })
  }else{
    alert("Payment Already Completed")
    this.tableInfo = new TableInfo(0,this.tableNumber, null, null, null,null, "available");
    this.myservice.updateTableStatus(this.tableInfo).subscribe(() => {});
  }
  
  

 }

 showBill(){
  this.myservice.getAllBill(this.bill.billId).subscribe((x) => {this.bills = x});
  // this.myservice.getBillId(this.customerId,this.date).subscribe((x)=>{this.bill=x;});
  this.grossSale=this.bill.totalBill;
  this.netSale=this.grossSale;
  this.paymentStatus=this.bill.billStatus;
 }

 

     

  }





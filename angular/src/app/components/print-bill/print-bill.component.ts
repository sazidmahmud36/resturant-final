import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Payment } from 'src/app/model/payment';
import { TableInfo } from 'src/app/model/table-info';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-print-bill',
  templateUrl: './print-bill.component.html',
  styleUrls: ['./print-bill.component.css']
})
export class PrintBillComponent {
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
   
    this.bills=this.router.getCurrentNavigation()?.extras.state?.["bills"];
    this.bill=this.router.getCurrentNavigation()?.extras.state?.["bill"];
    this.payAmmount=this.router.getCurrentNavigation()?.extras.state?.["payAmmount"];
    this.return=this.router.getCurrentNavigation()?.extras.state?.["return"];
    // alert(this.bills);
    // alert(this.bill);
    this.showBill();
    this.calculate();
    // alert("Print Ready")
      // window.print();
    }
    print(){
      window.print();
    }

 calculate(){
  this.netSale=this.grossSale-this.Discount;
  this.return=this.payAmmount-this.netSale;
  
 }
 

 showBill(){
  this.grossSale=this.bill.totalBill;
  this.netSale=this.grossSale;
  this.paymentStatus=this.bill.billStatus;
 }
}

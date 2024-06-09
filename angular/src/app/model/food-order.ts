export class FoodOrder {

     orderId:any;
	 tableNumber:any;
	 customerId:any;
	 processSchedule:any;
	 date:any;
	 orderStatus:any;



     constructor(orderId:any,tableNumber:any,customerId:any,processSchedule:any,date:any,orderStatus:any){
        this.orderId = orderId;
        this.tableNumber = tableNumber;
        this.customerId = customerId;
        this.processSchedule = processSchedule;
        this.date= date;
        this.orderStatus = orderStatus
     }
}

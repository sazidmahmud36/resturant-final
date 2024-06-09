export class Booking {
     bookingId: any;
	 tableNo: any;
	 customerId: any;
	 bookingTime: any;
	 bookingStatus: any;
	 date: any;
	 orderId: any;

     constructor(bookingId: any,tableNo: any,customerId: any,bookingTime: any,bookingStatus: any,date: any,orderId: any){
        this.bookingId = bookingId;
        this.tableNo = tableNo;
        this.customerId = customerId;
        this.bookingTime = bookingTime;
        this.bookingStatus = bookingStatus;
        this.date = date;
        this.orderId = orderId;
     }
}

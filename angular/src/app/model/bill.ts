export class Bill {
    billId: any;	
	customerId: any;
	date: any;
	totalBill: any;
	paid: any;
	due: any;
	billStatus: any;

    constructor(billId: any,customerId: any,date: any,totalBill: any,paid: any,due: any,billStatus: any){
        this.billId = billId;
        this.customerId = customerId;
        this.date = date;
        this.totalBill = totalBill;
        this.paid = paid;
        this.due = due;
        this.billStatus = billStatus;
    }
}

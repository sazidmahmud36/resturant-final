export class Payment {
    paymentId: any;
    date: any;
    billId: any;
    customerId: any;
    amount: any;
    paymentType: any;

    constructor(paymentId: any,date: any,billId: any,customerId: any,amount: any,paymentType: any) {
        this.paymentId = paymentId;
        this.date = date;
        this.billId = billId;
        this.customerId = customerId;
        this.amount = amount;
        this.paymentType = paymentType;
    }
}

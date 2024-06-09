export class BillDes {

   desId:any;
	billId:any;
	tableNumber:any;
	foodId:any;
   orderQuantity:any;
	amount:any;
   totalprice:any;
    

     constructor(desId:any, billId:any,tableNumber:any,foodId:any, orderQuantity:any, amount:any,totalprice:any){
        this.desId = desId;
        this.billId = billId;
        this.tableNumber = tableNumber;
        this.foodId = foodId;
        this.orderQuantity = orderQuantity;
        this.amount = amount;
        this.totalprice = totalprice;
     }

}

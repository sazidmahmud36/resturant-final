export class StockTnx {

     sTnxId:any;
	 productName:any;
	 purchaseDate:any;
	 amount:any;
	 stockId:any;
	 size:any;

     constructor(sTnxId:any,productName:any,purchaseDate:any,amount:any,stockId:any,size:any){
        this.sTnxId = sTnxId;
        this.productName = productName;
        this.purchaseDate = purchaseDate;
        this.amount = amount;
        this.stockId = stockId;
        this.size = size;
     }
     
}

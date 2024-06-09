export class TableInfo {
     tableId:any;
	 tableNumber:any;
	 tableSit:any;
	 tablePosition:any;
	 tableService:any;	
	 fph:any;
	 status:any;

     constructor(tableId:any,tableNumber:any,tableSit:any,tablePosition:any,tableService:any,fph:any,status:any){
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.tableSit = tableSit;
        this.tablePosition = tablePosition;
        this.tableService = tableService;
        this.fph = fph;
        this.status = status;
     }
}

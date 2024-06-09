import { Component } from '@angular/core';
import { FoodItem } from 'src/app/model/food-item';
import { TableInfo } from 'src/app/model/table-info';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent {

  
  templete:any = "createTable";
constructor(private myservice: ControllerService){

}

    tableId:any;
	 tableNumber:any;
	 tableSit:any;
	 tablePosition:any;
	 tableService:any;	
	 fph:any;
	 status:any;


   foodId: any;
	 foodName: any;
	 foodPrice: any;

   food: any;
   table:any;

   addFood(){
    this.food = new FoodItem(this.foodId,this.foodName,this.foodPrice);
    this.myservice.addFood(this.food).subscribe(() => {
      alert("Food Added!");
    })
  }

    createNewTable(){
      // alert(this.FpH);
      this.table = new TableInfo(this.tableId, this.tableNumber, this.tableSit,this.tablePosition,this.tableService, this.fph,this.status);
      this.myservice.addTable(this.table).subscribe(() =>{
        alert("Table Created!");
      });
    }

}

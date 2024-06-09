import { Component } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-available-table',
  templateUrl: './available-table.component.html',
  styleUrls: ['./available-table.component.css']
})
export class AvailableTableComponent {

  allAvailableTables:any;

  constructor(private myservice: ControllerService){
    this.myservice.showAllAvailableTable().subscribe((x) => {this.allAvailableTables = x});
  }

}

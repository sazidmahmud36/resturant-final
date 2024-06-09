import { Component } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-food-menu',
  templateUrl: './food-menu.component.html',
  styleUrls: ['./food-menu.component.css']
})
export class FoodMenuComponent {
  allFood:any;
  
  constructor(private myservice: ControllerService){
    this.myservice.getAllFood().subscribe((x) => {this.allFood = x});
  }
}

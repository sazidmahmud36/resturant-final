import { Component } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-all-food',
  templateUrl: './all-food.component.html',
  styleUrls: ['./all-food.component.css']
})
export class AllFoodComponent {
  allFood:any;
  constructor(public myservice: ControllerService){
    this.myservice.getAllFood().subscribe((x) => {this.allFood = x});
  }
}

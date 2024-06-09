import { Component } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  allFood:any;
  
  constructor(private myService: ControllerService){
    this.myService.getAllFood().subscribe((x) => {this.allFood = x});
  }
}

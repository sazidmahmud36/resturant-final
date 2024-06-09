import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/user';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {

  admin_id:any;
  admin_name:any;
  admin_email:any;
  admin_pass: any;
  allData: any;
  
  constructor(private myservice: ControllerService, private router: Router){

  }

  reg(){
    this.allData = new User(this.admin_id, this.admin_name, this.admin_email, this.admin_pass);
    this.myservice.reg(this.allData).subscribe(() => { });
    this.router.navigateByUrl("allemployee");
    alert("Registration Successful!");
  }
}

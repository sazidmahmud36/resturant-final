import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private myservice: ControllerService, private router: Router) {

  }

  admin_id: any;
  admin_email: any;
  admin_pass: any;
  loginUser: any;



  login() {
    this.myservice.loginById(this.admin_id, this.admin_pass).subscribe((x) => {

      this.loginUser = x;
      if ((this.loginUser != null)) {
        // this.router.navigateByUrl("admin", { state: { response: this.loginUser } });
        this.router.navigateByUrl("admin");

      } else {
        this.router.navigateByUrl("error");
      }

    });

  }

}

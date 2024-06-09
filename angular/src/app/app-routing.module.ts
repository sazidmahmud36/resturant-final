import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { OrderComponent } from './components/order/order.component';
import { ServiceComponent } from './components/service/service.component';
import { TableBookingComponent } from './components/table-booking/table-booking.component';
import { PaymentsComponent } from './components/payments/payments.component';

import { PrintBillComponent } from './components/print-bill/print-bill.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import { LoginComponent } from './components/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AvailableTableComponent } from './components/available-table/available-table.component';
import { AllFoodComponent } from './components/all-food/all-food.component';
import { ChefsComponent } from './components/chefs/chefs.component';
import { FoodMenuComponent } from './components/food-menu/food-menu.component';
import { AboutComponent } from './components/about/about.component';

const routes: Routes = [
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:DashboardComponent},
      {path:'order',component:OrderComponent},
      {path:'service',component:ServiceComponent},
      {path:'tablebooking',component:TableBookingComponent},
      {path:'payment',component:PaymentsComponent},
      {path:'dashboard',component:DashboardComponent},
      {path:'availabletables',component:AvailableTableComponent},
      {path:'allfood',component:AllFoodComponent},
      {path:'registration',component:RegistrationComponent},
      
    ]
    
  },
  {path:'printbill',component:PrintBillComponent},
  {path:'home',component:HomeComponent},
  {path:'',component:HomeComponent},
  {path:'user',component:UserComponent},
  {path:'login',component:LoginComponent},
  {path:'error',component:ErrorComponent},
  {path:'chefs',component:ChefsComponent},
  {path:'menu',component:FoodMenuComponent},
  {path:'about',component:AboutComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

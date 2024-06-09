import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from  '@angular/common/http';
import { AdminComponent } from './components/admin/admin.component';
import { LoginComponent } from './components/login/login.component';
import { SideNavComponent } from './components/side-nav/side-nav.component';
import { OrderComponent } from './components/order/order.component';
import { ServiceComponent } from './components/service/service.component';
import { TableBookingComponent } from './components/table-booking/table-booking.component';
import { PaymentsComponent } from './components/payments/payments.component';

import { PrintBillComponent } from './components/print-bill/print-bill.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { UserComponent } from './components/user/user.component';
import { FooterComponent } from './components/footer/footer.component';
import { ErrorComponent } from './components/error/error.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AvailableTableComponent } from './components/available-table/available-table.component';
import { AllFoodComponent } from './components/all-food/all-food.component';
import { HeroComponent } from './components/hero/hero.component';
import { ChefsComponent } from './components/chefs/chefs.component';
import { FoodMenuComponent } from './components/food-menu/food-menu.component';
import { AboutComponent } from './components/about/about.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    LoginComponent,
    SideNavComponent,
    OrderComponent,
    ServiceComponent,
    TableBookingComponent,
    PaymentsComponent,
    PrintBillComponent,
    HomeComponent,
    HeaderComponent,
    UserComponent,
    FooterComponent,
    ErrorComponent,
    RegistrationComponent,
    DashboardComponent,
    AvailableTableComponent,
    AllFoodComponent,
    HeroComponent,
    ChefsComponent,
    FoodMenuComponent,
    AboutComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

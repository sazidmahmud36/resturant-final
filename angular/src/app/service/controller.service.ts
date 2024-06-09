import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FoodItem } from '../model/food-item';
import { TableInfo } from '../model/table-info';
import { Customer } from '../model/customer';
import { Booking } from '../model/booking';
import { Bill } from '../model/bill';
import { BillDes } from '../model/bill-des';
import { Payment } from '../model/payment';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class ControllerService {
  url:any = "http://localhost:8080/";

  constructor(private http: HttpClient) { }


  // ================ Food Item =================

  public addFood(f: any):Observable<FoodItem>{
    this.url = "http://localhost:8080/addfood";
    return this.http.post<FoodItem>(this.url, f);
  }
  public getFoodById(id:any):Observable<FoodItem>{
    this.url="http://localhost:8080/getfoodbyid/"+id;
    return this.http.get<FoodItem>(this.url);
  }

  public getAllFood():Observable<FoodItem>{
    this.url="http://localhost:8080/allfood";
    return this.http.get<FoodItem>(this.url);
  }



  // ================ Table =================
  
  public addTable(f: any):Observable<TableInfo>{
    // alert(f.fph)
    this.url = "http://localhost:8080/addtable";
    return this.http.post<TableInfo>(this.url, f);
  }

  getAllTable():Observable<TableInfo>{
    this.url="http://localhost:8080/alltable";
    return this.http.get<TableInfo>(this.url);
  }

  getAllFreeTable(s: any):Observable<TableInfo>{
    this.url="http://localhost:8080/allfreetable/"+{s};
    return this.http.get<TableInfo>(this.url);
  }

  getAllTableSit():Observable<TableInfo>{
    this.url="http://localhost:8080/callSit";
    return this.http.get<TableInfo>(this.url);
  }

  updateTableStatus(s: any):Observable<TableInfo>{
    this.url="http://localhost:8080/updatetable";
    return this.http.put<TableInfo>(this.url, s);
  }

  showAllBookedTable():Observable<TableInfo>{
    this.url="http://localhost:8080/allbookedtable";
    return this.http.get<TableInfo>(this.url);
  }

  showAllAvailableTable():Observable<TableInfo>{
    this.url="http://localhost:8080/allavailabletable";
    return this.http.get<TableInfo>(this.url);
  }

  // ================ Customer =================

  findCreateCustomer(c:any):Observable<Customer>{
    // alert("create Customer Worked");
    this.url="http://localhost:8080/findCustomer";
    return this.http.post<Customer>(this.url,c);
  }




    // ================ Booking =================
  newBooking(s: any):Observable<Booking>{
    // alert("controller new booking");
    this.url="http://localhost:8080/newbooking";
    return this.http.post<Booking>(this.url,s);
  }
  getAllbookingByDate(date:any,status:any):Observable<Booking>{
    this.url="http://localhost:8080/allbookedtable/"+date+"/"+status;
    return this.http.get<Booking>(this.url);
  }

  updateBookingStatus( id:any):Observable<Booking>{
    this.url="http://localhost:8080/updatecheckoutbooking/"+id;
    return this.http.get<Booking>(this.url);
  }
  bookingDataById( id:any):Observable<Booking>{
    this.url="http://localhost:8080/bookeddatabyid/"+id;
    return this.http.get<Booking>(this.url);
  }

  //========================Bill=========================
  newBill(b:any):Observable<Bill>{
    this.url="http://localhost:8080/newbill";
    return this.http.post<Bill>(this.url,b);
  }
  getBillId(customerId:any,date:any):Observable<Bill>{
    this.url="http://localhost:8080/bill/"+customerId+"/"+date;
    return this.http.get<Bill>(this.url);
  }

  updateBill(b:any):Observable<Bill>{
    this.url="http://localhost:8080/updatebill";
    return this.http.put<Bill>(this.url,b);
  }


  //========================Bill Des=========================

  tableBillDes(d:any):Observable<BillDes>{
    this.url="http://localhost:8080/tablebookingbilldes";
    return this.http.post<BillDes>(this.url,d);
  }
  foodBillDes(d:any):Observable<BillDes>{
    this.url="http://localhost:8080/foodbilldes";
    return this.http.post<BillDes>(this.url,d);
  }

    getAllBill(b:any){
      this.url="http://localhost:8080/getallbill/"+b;
      return this.http.get<BillDes>(this.url);
    }

  //========================Bill Des=========================

  savetransection(p:any):Observable<Payment>{
    this.url="http://localhost:8080/savetransection";
    return this.http.post<Payment>(this.url,p);
  }

    //========================Login=========================


    loginById(admin_id:any,admin_pass:any):Observable<User>{
      this.url="http://localhost:8080/logindata/";
      return this.http.get<User>(this.url+admin_id+"/"+admin_pass);
    }
  
    //========================Registration=========================

    reg(s:User):Observable<User>{
      this.url="http://localhost:8080/registration";
      return this.http.post<User>(this.url,s);
    }

}

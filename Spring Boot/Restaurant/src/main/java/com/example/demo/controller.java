package com.example.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import DA.*;
import model.*;

@CrossOrigin(origins = "*")
@RestController

public class controller {

	// =========================Add Food ===========================

	@PostMapping("/addfood")
	public void addFood(@RequestBody FoodItem f) {
		FoodItemDA da = new FoodItemDA();
		da.addFood(f);
	}

	@GetMapping("/getfoodbyid/{id}")
	public List<FoodItem> getFoodById(@PathVariable int id) {
		FoodItemDA da = new FoodItemDA();

		return da.getFoodById(id);
	}
	
	@GetMapping("/allfood")
	public List<FoodItem> allFood() {
		FoodItemDA da = new FoodItemDA();

		return da.getAllFood();
	}
	

	// =========================Table Info===========================

	@PostMapping("/addtable")
	public void addtable(@RequestBody TableInfo f) {
		TableInfoDA da = new TableInfoDA();
		da.createNewTable(f);
	}

	@PutMapping("/updatetable")
	public void updateTableStatus(@RequestBody TableInfo f) {
		TableInfoDA da = new TableInfoDA();
		da.tableStatusUpdate(f);
	}

	List<TableInfo> showAllTable = new ArrayList<>();

	@GetMapping("/alltable")
	public List<TableInfo> showAllTable() {
		TableInfoDA da = new TableInfoDA();
		showAllTable = da.getAllTable();

		return showAllTable;
	}

	@GetMapping("/allbookedtable")
	public List<TableInfo> showAllBookedTable() {
		TableInfoDA da = new TableInfoDA();

		return da.getAllBookedTable();
	}

	@GetMapping("/allavailabletable")
	public List<TableInfo> showAllAvailableTable() {
		TableInfoDA da = new TableInfoDA();

		return da.getAllavailableTable();
	}

	List<TableInfo> showAllFreeTable = new ArrayList<>();

	@GetMapping("/allfreetable/{time}")
	public List<TableInfo> showAllFreeTable(@PathVariable String time) {
		TableInfoDA da = new TableInfoDA();
		showAllTable = da.getAllFreeTable(time);

		return showAllFreeTable;
	}

	@GetMapping("/callSit")
	public List sit() {
		TableInfoDA da = new TableInfoDA();

		return da.getAllTableSit();
	}

	// =========================Customer Table===========================

	@PostMapping("/findCustomer")
	public Customer findCustomer(@RequestBody Customer customer) {
		System.out.println("Controller Customer works");
		System.out.println(customer);
		CustomerDA da = new CustomerDA();
		return da.addCustomer(customer);
	}

	// =========================Booking Table===========================

	@PostMapping("/newbooking")
	public void newBooking(@RequestBody Booking b) {

		BookingDA da = new BookingDA();
		da.addBooking(b);
	}

	@GetMapping("/allbookedtable/{date}/{status}")
	public List<Booking> allBookedTableByDate(@PathVariable Date date, @PathVariable String status) {
		BookingDA da = new BookingDA();
		return da.allbookeddata(date, status);
	}

	@GetMapping("/updatecheckoutbooking/{id}")
	public void updateCheckOutBooking(@PathVariable int id) {
		BookingDA da = new BookingDA();
		da.updateCheckOutBooking(id);
	}

	@GetMapping("/bookeddatabyid/{id}")
	public Booking BookedById(@PathVariable int id) {
//		System.out.println(id);
		BookingDA da = new BookingDA();
		return da.allbookeddata(id);
	}

	// =========================Bill===========================
	@PostMapping("/newbill")
	public Bill newBill(@RequestBody Bill b) {
//		System.out.println("Controller Bill works");
		BillDA da = new BillDA();
		return da.addBill(b);
	}

	@GetMapping("/bill/{customerId}/{date}")
	public Bill getBillId(@PathVariable int customerId, @PathVariable Date date) {
		System.out.println(date);
		BillDA da = new BillDA();

		return da.getBillIdByCustomerId(customerId, date);
	}

	@PutMapping("/updatebill")
	public void updateBill(@RequestBody Bill b) {
//		System.out.println("Controller Bill works");
		BillDA da = new BillDA();
		da.billupdate(b);
	}

	// =========================Bill Description===========================

	@PostMapping("/tablebookingbilldes")
	public void tableBookingBillDes(@RequestBody BillDes b) {
//		System.out.println("Controller BillDes works");
//		System.out.println(b);
		BillDesDA da = new BillDesDA();
		da.addTableBookingBillDesc(b);
	}

	@PostMapping("/foodbilldes")
	public void foodBillDes(@RequestBody List<BillDes> bill) {
//		System.out.println("Controller BillDes works");
//		System.out.println(b);
		BillDesDA da = new BillDesDA();
		da.addFoodBillDesc(bill);
	}

	@GetMapping("getallbill/{billid}")
	public List<BillDes> getAllBill(@PathVariable int billid) {
//		System.out.println(date);
		BillDesDA da = new BillDesDA();

		return da.getAllBill(billid);
	}

	// =========================Transection ===========================

	@PostMapping("/savetransection")
	public void saveTransection(@RequestBody Payment p) {
//		System.out.println("Controller BillDes works");
//		System.out.println(b);
		PaymentDA da = new PaymentDA();
		da.addPayment(p);
	}

	// =========================registration ===========================

	@PostMapping("/registration")
	public void saveAdmin(@RequestBody User a) {
//		System.out.println("Controller BillDes works");
//		System.out.println(b);
		UserDA da = new UserDA();
		da.register(a);
	}

	// =========================Login ===========================

	@GetMapping("/logindata/{id}/{password}")
	public User m3(@PathVariable int id, @PathVariable String password) {
		UserDA da = new UserDA();
		User data = da.login(id, password);
		return data;
	}
}

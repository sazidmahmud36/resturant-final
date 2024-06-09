import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableBookingComponent } from './table-booking.component';

describe('TableBookingComponent', () => {
  let component: TableBookingComponent;
  let fixture: ComponentFixture<TableBookingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TableBookingComponent]
    });
    fixture = TestBed.createComponent(TableBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

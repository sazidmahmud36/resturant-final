import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AvailableTableComponent } from './available-table.component';

describe('AvailableTableComponent', () => {
  let component: AvailableTableComponent;
  let fixture: ComponentFixture<AvailableTableComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AvailableTableComponent]
    });
    fixture = TestBed.createComponent(AvailableTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

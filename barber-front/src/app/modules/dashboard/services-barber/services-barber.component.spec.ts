import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicesBarberComponent } from './services-barber.component';

describe('ServicesBarberComponent', () => {
  let component: ServicesBarberComponent;
  let fixture: ComponentFixture<ServicesBarberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ServicesBarberComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ServicesBarberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { Component } from '@angular/core';
import { BarberService } from '../services/barber.service';
import { BarberServiceModel } from '../models/barber-services.model';

@Component({
  selector: 'app-services-barber',
  standalone: true,
  imports: [],
  templateUrl: './services-barber.component.html',
  styleUrl: './services-barber.component.scss',
})
export class ServicesBarberComponent {
  barberService: BarberServiceModel[] = [];

  constructor(private service: BarberService) {

  }

  findAL(){
    this.service.findAllService().
  }
}

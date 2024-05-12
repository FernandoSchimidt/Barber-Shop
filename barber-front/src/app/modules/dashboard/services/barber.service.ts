import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class BarberService {
  private URLBASE: string = 'http://localhost:8088/api/v1/barber';

  constructor(private http: HttpClient) {}

  findAllService() {
    this.http.get(this.URLBASE);
  }
}

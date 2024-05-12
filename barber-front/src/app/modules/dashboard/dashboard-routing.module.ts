import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ServicesBarberComponent } from './services-barber/services-barber.component';

const routes: Routes = [{ path: '', component: ServicesBarberComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DashboardRoutingModule {}

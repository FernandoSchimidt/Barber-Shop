import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-activate-account',
  standalone: true,
  imports: [],

  templateUrl: './activate-account.component.html',
  styleUrl: './activate-account.component.scss'
})
export class ActivateAccountComponent {

  message = '';
  isOkay = true;
  submitted = false;
  constructor(
    private router: Router
  ) {}

  private confirmAccount(token: string) {
    // this.authService
    //   .confirm({
    //     token,
    //   })
    //   .subscribe({
    //     next: () => {
    //       this.message =
    //         'Your account has been successfully activated.\nNow you can proceed to login';
    //       this.submitted = true;
    //     },
    //     error: () => {
    //       this.message = 'Token has been expired or invalid';
    //       this.submitted = true;
    //       this.isOkay = false;
    //     },
    //   });
  }

  redirectToLogin() {
    this.router.navigate(['login']);
  }

  onCodeCompleted(token: string) {
    this.confirmAccount(token);
  }

  // protected readonly skipUntil = skipUntil;
}

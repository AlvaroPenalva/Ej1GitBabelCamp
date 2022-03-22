import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ejercicio10';
  sol = 1

  a = 0
  b = 0

  public suma(){
    this.sol = this.a + this.b;
    console.log(this.sol);
  }

  public resta(){
    this.sol = this.a - this.b;
  }

  public mult(){
    this.sol = this.a * this.b;
  }

  public div(){
    this.sol = this.a / this.b;
  }

}

import { Component, Input, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { JuegosComponent } from '../juegos/juegos.component';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  @Input() contacto:boolean = false;
  @Input() descripcion:boolean = false;
  @Input() juegos:boolean = false;

  navigateJuegos(){
    this.router.navigate(['/juegos', JuegosComponent.usuario]);
  }

  navigateContacto(){
    this.router.navigate(['/contacto']);
  }

  navigateDescripcion(){
    this.router.navigate(['/bio']);
  }
}

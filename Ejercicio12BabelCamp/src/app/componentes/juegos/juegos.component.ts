import { Component, OnInit } from '@angular/core';
import { ActivatedRoute} from '@angular/router';
import { Usuario } from 'src/app/entidades/usuario';
import { Videojuego } from 'src/app/entidades/videojuego';

@Component({
  selector: 'app-juegos',
  templateUrl: './juegos.component.html',
  styleUrls: ['./juegos.component.css']
})
export class JuegosComponent implements OnInit {

  ngOnInit(): void {
  }

  //Usuario estatico para navegar por el menu.
  static usuario:string;
  nombre:string = JuegosComponent.usuario;

  juegos:boolean = true;

  listaJuegos : Array<Videojuego> = new Array<Videojuego>(
    new Videojuego(0, "Zelda Breath of the Wild", "Nintendo", 9.6, "assets/zelda.jpg"),
    new Videojuego(1, "Metroid Dread", "Nintendo", 9, "assets/metroid-dread-eur.jpg"),
    new Videojuego(2, "GTA San Andreas", "Rockstar", 9.8, "assets/gta.jpg"),
    new Videojuego(3, "Pro Evolution Soccer 6", "Konami", 8.7, "assets/pes6.jpg"));

  constructor(route:ActivatedRoute){
    JuegosComponent.usuario = route.snapshot.params["usuario"];
  }

  change(juego:Videojuego){
    juego.mostrar = !juego.mostrar;
  }



}

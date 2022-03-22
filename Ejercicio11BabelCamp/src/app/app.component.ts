import { Component } from '@angular/core';
import { Videojuego } from './videojuego';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ejercicio11';
  videojuegos: Array<Videojuego> = new Array();

  id:number = 1;
  titulo:string = "";
  compania:string = "";
  valoracion:number = 0;

  //Seleccionado sera -1 cuando no haya seleccionado ningun juego y la posicion de un juego en el array en caso
  //de que este este seleccionado
  seleccionado:number = -1;

  /* Guarda todos los datos de los campos de input junto a un id autogenerado en el array
  */
  guardar(){
    let videojuego : Videojuego = new Videojuego(this.id, this.titulo, this.compania, this.valoracion)
    this.videojuegos.push(videojuego);
    this.vaciar();
    this.seleccionado = -1;
    this.id++;
    }

    //vacia todos los inputs y  des-selecciona el videojuego en caso de que haya uno seleccionado
  vaciar(){
    this.titulo = "";
    this.compania = "";
    this.valoracion = 0;
    this.seleccionado = -1;
  }

  //selecciona un videojuego y actualiza los campos del input a los valores de este
  seleccionar(juego:Videojuego, indice: number){
    this.titulo = juego.titulo;
    this.compania = juego.compania;
    this.valoracion = juego.valoracion;
    this.seleccionado = indice;
  }

  //modifica un juego seleccionado vacia los inputs y des-selecciona
  modificar(){
    this.videojuegos[this.seleccionado] = new Videojuego(this.seleccionado, this.titulo, this.compania, this.valoracion);
    this.seleccionado = -1;
    this.vaciar();
  }

  //elimina el videojuego seleccionado del array
  eliminar(){
    this.videojuegos.splice(this.seleccionado, 1);

  }

}

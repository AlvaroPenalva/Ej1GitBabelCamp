import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ejercicio9';

  nombre = "Álvaro Penalva Alberca";

  lenguajes:string = "C++, java, kotlin, HTML5, CSS, javascript, mongodb, SQL.";

  correo:string = "alvaro_penalva@hotmail.com";

  telefono:string = "659996293";

  direccion:string = "Calle Fernán Caballero 26, 2ºF";

  imagenPerfil:string = "assets/img/fotoCV.jpg";

}

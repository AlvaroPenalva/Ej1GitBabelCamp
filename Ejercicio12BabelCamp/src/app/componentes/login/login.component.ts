import {
  Component,
  OnInit
} from '@angular/core';
import {
  Router
} from '@angular/router';
import {
  AppComponent
} from 'src/app/app.component';
import {
  ListaUsuarios
} from 'src/app/entidades/listaUsuarios';
import {
  Usuario
} from 'src/app/entidades/usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //Valores de los inputs de usuario y contrasenia
  usuario: string = "";
  password: string = "";

  //booleanos para mostrar mensaje en caso de no introducir correctamente alguno de los dos valores
  noPassword: boolean = true;
  noUser: boolean = true;

  //Clase encargada de checkear el usuario
  listaUsuarios: ListaUsuarios = new ListaUsuarios();

  //booleano para mostrar que ha quedado uno de los dos campos vacio
  vacio: boolean = false;

  constructor(private router: Router) {

  }

  ngOnInit(): void {}

  /*
    Este metodo comprueba el usuario y la contrasenia, en caso de ser alguno de los dos erroneos informa cual es,
    y vacia los campos al mismo tiempo que el mensaje de aviso se borra a los 4 segundos.
    En caso de no haber completado los dos campos estos se mantenndran y se notificara al usuario
  */
  loguear(): void {
    //alguno de los dos campos vacio
    if (this.usuario == "" || this.password == "") {
      this.vacio = true;
      //para ocultar el aviso despues de 4s
      setTimeout(() => {
        this.vacio = false;
      }, 4000)
    } else {
      let res: number;
      res = this.listaUsuarios.comprobarUsuario(this.usuario, this.password);

      //logueo correcto
      if (res == 0) {
        this.router.navigate(['/juegos', this.usuario]);
        AppComponent.loggeado = true;
      }

      //segun lo que haya fallado se lleva a cabo una accion para notificar al usuario
      else {
        if (res == 1) this.noPassword = false;
        if (res == 2) this.noUser = false;
        setTimeout(() => {
          this.noUser = true;
          this.noPassword = true;
        }, 4000)
        this.vaciarCampos();
      }
    }


  }

  vaciarCampos() {
    this.password = "";
    this.usuario = "";
  }

}

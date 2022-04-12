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
import {
  LoginServiceService
} from 'src/app/servicios/login-service.service';

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

  fail: boolean = true;

  //Clase encargada de checkear el usuario
  listaUsuarios: ListaUsuarios = new ListaUsuarios();

  //booleano para mostrar que ha quedado uno de los dos campos vacio
  vacio: boolean = false;

  constructor(private router: Router, private _loginService: LoginServiceService) {
    this._loginService = _loginService;
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
      //let user = new Usuario(this.usuario, this.password); //por si queremos mandarlo por Post
      this._loginService.loginGet(this.usuario, this.password).subscribe(
        respuesta => { //'respuesta' es un objeto Json que contiene el body
          if (respuesta.validado) {
            this.router.navigate(['/juegos', this.usuario]);
            AppComponent.loggeado = true;
          } else {
            this.fail = false;
            setTimeout(() => {
              this.fail = true;
            }, 4000)
            this.vaciarCampos();
          }
        }
      );
    }


  }

  vaciarCampos() {
    this.password = "";
    this.usuario = "";
  }

}

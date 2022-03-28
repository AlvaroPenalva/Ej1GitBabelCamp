import {
  Component,
  OnInit,
  Output
} from '@angular/core';
import {
  Router
} from '@angular/router';
import { AppComponent } from 'src/app/app.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuarios: Map <string,string> = new Map([
    ["Yo", "Yo"],
    ["Felix", "1234"],
    ["Alvaro", "elpapu"],
    ["Juja", "ratilla"]
  ])

  usuario: string = "";
  password: string = "";
  @Output() loggeado: boolean = false;
  noPassword: boolean = true;
  noUser: boolean = true;

  constructor(private router: Router) {

  }

  ngOnInit(): void {}

  /*
    Este metodo comprueba el usuario y la contrasenia, en caso de ser alguno de los dos erroneos informa cual es,
    y vacia los campos al mismo tiempo que el mensaje de aviso se borra a los 4 segundos.
  */
  loguear(): void {

    if (this.usuarios.has(this.usuario)) {

      if (this.usuarios.get(this.usuario) == this.password){
        this.router.navigate(['/juegos']);
        AppComponent.loggeado = true;
      }

      else {
        this.noPassword = false;
        this.vaciarCampos();
      }

    } else {
      this.noUser = false;
      this.vaciarCampos();
    }

    setTimeout(() => {
      this.noUser = true;
      this.noPassword = true;
    }, 4000)
  }

  vaciarCampos() {
    this.password = "";
    this.usuario = "";
  }

}

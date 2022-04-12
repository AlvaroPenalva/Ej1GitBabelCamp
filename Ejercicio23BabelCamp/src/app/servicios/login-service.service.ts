import {
  Injectable
} from '@angular/core';
import {
  HttpClient,
  HttpErrorResponse,
  HttpHeaders
} from '@angular/common/http';
import {
  catchError,
  Observable,
  throwError
} from 'rxjs';
import {
  Usuario
} from '../entidades/usuario';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  readonly endPoint = "http://localhost:8080/Ejercicio21BabelCamp/"

  constructor(private httpClient: HttpClient) {}

  public loginGet(user: String, password: String): Observable < any > {
    return this.httpClient.get < any > (`${this.endPoint}?user=${user}&password=${password}`)
      .pipe(catchError(this.manejarError))
  }

  public loginPost(user: Usuario): Observable < any > {
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json; charset=utf-8');
    return this.httpClient.post < any > (
      this.endPoint,
      user.toString(), {
        headers: headers
      }
    ).pipe(catchError(this.manejarError))
  }

  private manejarError(error: HttpErrorResponse) {
    let mensajeError = ''
    if (error.error instanceof ErrorEvent) {
      mensajeError = 'Ha ocurrido un error:' + error.error
    } else {
      mensajeError = `El servicio Rest retorno: Status: ${error.status}, ` +
        `Body: ${error.error}`
    }
    console.error(mensajeError)
    return throwError(() => new Error(mensajeError));
  }
}

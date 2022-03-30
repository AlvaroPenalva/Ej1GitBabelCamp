
export class ListaUsuarios{
     usuarios: Map <string,string> = new Map([
        ["Yo", "Yo"],
        ["Felix", "1234"],
        ["Alvaro", "elpapu"],
        ["Juja", "ratilla"]
      ])

      comprobarUsuario(user:string, password: string): number{
        if (this.usuarios.has(user)) {

            //retorna 0 con loggeo correcto
            if (this.usuarios.get(user) == password){
              return 0;
            }
            //retorna 1 con contrasenia incorrecta
            else {
              return 1;
            }
            //retorna 2 con usuario inexistente o incorrecto
          } else {
            return 2;
          }

      }
}
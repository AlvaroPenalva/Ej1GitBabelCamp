export class Videojuego{
    private id:number;
    private _titulo: string;
    private _compania: string;
    private _valoracion: number;
    constructor(id:number, titulo:string, compania:string, valoracion: number) {
      this.id = id;
      this._titulo = titulo;
      this._compania = compania;
      this._valoracion = valoracion;
    }

    public get getId(){
      return this.id;
    }
    public get titulo(): string {
      return this._titulo;
    }
    public set titulo(value: string) {
      this._titulo = value;
    }
    public get compania(): string {
      return this._compania;
    }
    public set compania(value: string) {
      this._compania = value;
    }
    public get valoracion(): number {
      return this._valoracion;
    }
    public set valoracion(value: number) {
      this._valoracion = value;
    }
  }
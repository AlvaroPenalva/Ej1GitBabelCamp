export class Videojuego{
    private _id:number;
    private _titulo: string;
    private _compania: string;
    private _valoracion: number;
    private _img: string;
    private _mostrar: boolean = false;

    constructor(id:number, titulo:string, compania:string, valoracion: number, img:string) {
      this._id = id;
      this._titulo = titulo;
      this._compania = compania;
      this._valoracion = valoracion;
      this._img = img;
    }

    public get id(){
      return this._id;
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
    public get img(): string {
      return this._img;
    }
    public set img(value: string) {
      this._img = value;
    }
    public get mostrar(): boolean {
      return this._mostrar;
    }
    public set mostrar(value: boolean) {
      this._mostrar = value;
    }
  }
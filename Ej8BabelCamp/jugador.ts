import { Historial } from "./historial.js";

export class Jugador{
    
    private _id: number;
    private _nombre: string;
    private _edad: number;
    private _pais: string;
    private _historial: Historial;

    constructor(id:number, nombre:string, edad:number, pais:string, historial?:Historial){
        this._id = id;
        this._nombre = nombre;
        this.edad = edad;
        this._pais = pais;

        if(historial != undefined) this._historial = historial;
    }

    public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }

    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }

    public get edad(): number {
        return this._edad;
    }
    public set edad(value: number) {
        this._edad = value;
    }

    public get pais(): string {
        return this._pais;
    }
    public set pais(value: string) {
        this._pais = value;
    }

    public get historial(): Historial {
        return this._historial;
    }
    public set historial(value: Historial) {
        this._historial = value;
    }

}
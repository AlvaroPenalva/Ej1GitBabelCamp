import { Jugador } from "./jugador.js";

export class Equipo{
    private _id: number;
    private _nombre: string;
    private _fechafund: Date;
    private _jugadores: Array<Jugador>;

    constructor(id:number, nombre: string, fechafund: Date, jugadores?: Array<Jugador>){
        this._id = id;
        this._nombre = nombre;
        this._fechafund = fechafund;
        if(jugadores != undefined) this._jugadores = jugadores;
        else this._jugadores = new Array<Jugador>();
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

    public get fechafund(): Date {
        return this._fechafund;
    }
    public set fechafund(value: Date) {
        this._fechafund = value;
    }

    public insertarJugador(jug:Jugador) {
        this._jugadores.push(jug);
    }

    public quitarJugador(jug: Jugador){
        let i: number = this._jugadores.indexOf(jug);
        this._jugadores.slice;
    }

    public get jugadores(){
        return this._jugadores;
    }
}
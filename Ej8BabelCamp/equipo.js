export class Equipo {
    constructor(id, nombre, fechafund, jugadores) {
        this._id = id;
        this._nombre = nombre;
        this._fechafund = fechafund;
        if (jugadores != undefined)
            this._jugadores = jugadores;
        else
            this._jugadores = new Array();
    }
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(value) {
        this._nombre = value;
    }
    get fechafund() {
        return this._fechafund;
    }
    set fechafund(value) {
        this._fechafund = value;
    }
    insertarJugador(jug) {
        this._jugadores.push(jug);
    }
    quitarJugador(jug) {
        let i = this._jugadores.indexOf(jug);
        this._jugadores.slice;
    }
    get jugadores() {
        return this._jugadores;
    }
}

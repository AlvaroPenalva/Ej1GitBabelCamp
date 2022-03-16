export class Jugador {
    constructor(id, nombre, edad, pais, historial) {
        this._id = id;
        this._nombre = nombre;
        this.edad = edad;
        this._pais = pais;
        if (historial != undefined)
            this._historial = historial;
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
    get edad() {
        return this._edad;
    }
    set edad(value) {
        this._edad = value;
    }
    get pais() {
        return this._pais;
    }
    set pais(value) {
        this._pais = value;
    }
    get historial() {
        return this._historial;
    }
    set historial(value) {
        this._historial = value;
    }
}

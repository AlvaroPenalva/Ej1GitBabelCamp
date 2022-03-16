class Equipo {
    constructor(id, nombre, fechafund, jugadores) {
        this._id = id;
        this._nombre = nombre;
        this._fechafund = fechafund;
        if (jugadores != undefined)
            this.jugadores = jugadores;
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
        this.jugadores.push(jug);
    }
    quitarJugador(jug) {
        let i = this.jugadores.indexOf(jug);
        this.jugadores.slice;
    }
}
export { Equipo };

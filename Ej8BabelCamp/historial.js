export class Historial {
    constructor(id, goles, tAmarilla, tRoja) {
        this._id = id;
        this._goles = goles;
        this._tAmarilla = tAmarilla;
        this._tRoja = tRoja;
    }
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
    get goles() {
        return this._goles;
    }
    set goles(value) {
        this._goles = value;
    }
    get tAmarilla() {
        return this._tAmarilla;
    }
    set tAmarilla(value) {
        this._tAmarilla = value;
    }
    get tRoja() {
        return this._tRoja;
    }
    set tRoja(value) {
        this._tRoja = value;
    }
}

export class Historial{

    private _id: number;
    private _goles: number;
    private _tAmarilla: number;
    private _tRoja: number;

    constructor(id: number,goles: number, tAmarilla: number, tRoja: number){
        this._id = id;
        this._goles = goles;
        this._tAmarilla = tAmarilla;
        this._tRoja = tRoja;
    }

    public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }

    public get goles(): number {
        return this._goles;
    }
    public set goles(value: number) {
        this._goles = value;
    }

    public get tAmarilla(): number {
        return this._tAmarilla;
    }
    public set tAmarilla(value: number) {
        this._tAmarilla = value;
    }

    public get tRoja(): number {
        return this._tRoja;
    }
    public set tRoja(value: number) {
        this._tRoja = value;
    }
}
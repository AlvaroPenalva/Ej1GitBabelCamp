import { Equipo } from "./equipo.js";
import { Jugador } from "./jugador.js";
import { Historial } from "./historial.js";

//Inicializacion del equipo
let equipo: Equipo = new Equipo(0, "Barrio", new Date(2022, 3, 15))

//Creacion de historiales y jugadores
let historial: Historial = new Historial(0, 4, 1, 0);
let jugador = new Jugador(0, "Juan", 22, "España", historial);
equipo.insertarJugador(jugador);


historial = new Historial(1, 0, 3, 0);
jugador = new Jugador(0, "Mariano", 36, "España", historial);
equipo.insertarJugador(jugador);

historial = new Historial(2, 50, 2, 1);
jugador = new Jugador(0, "CR7", 36, "Portugal", historial);
equipo.insertarJugador(jugador);

historial = new Historial(3, 2, 1, 0);
jugador = new Jugador(0, "Messi", 34, "Argentina", historial);
equipo.insertarJugador(jugador);

historial = new Historial(4, 17, 1, 0);
jugador = new Jugador(0, "ViniciusJr", 22, "Brasil", historial);
equipo.insertarJugador(jugador);

historial = new Historial(5, 6, 15, 5);
jugador = new Jugador(0, "Sergio Ramos", 33, "España", historial);
equipo.insertarJugador(jugador);

console.log(equipo);
//Aqui solo hay que cambiar el numero para leer la informacion de algun jugador. Van del 0 al 5.
console.log(equipo.jugadores[0]);
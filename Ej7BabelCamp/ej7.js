let notasParciales = [6, 3, 4];
let notaExamen = 7;
let trabajoFin = 4;
function calcularCalFin() {
    let notaFinal;
    notaFinal = ((notasParciales[0] + notasParciales[1] + notasParciales[2]) / 3) * 0.55 + (notaExamen * 0.3) + (trabajoFin * 0.15);
    console.log("Nota final: " + notaFinal);
}
let videojuegos = ["Zelda Breath of the Wild", "Mario Maker", "Elden Ring", "Dark Souls", "Monster hunter", "Mario 64"];
function noMario() {
    for (let game of videojuegos) {
        if (!game.includes("mario") && !game.includes("Mario") && !game.includes("MARIO"))
            console.log(game);
    }
}
let num = 5;
function factorial() {
    let sol = 1;
    for (let i = num; i > 0; --i)
        sol *= i;
    console.log("Factorial: ", sol);
}
calcularCalFin();
noMario();
factorial();


let notasParciales: number[] = [6,3,4]
let notaExamen:number = 7;
let trabajoFin:number = 4;

function calcularCalFin(){
    let notaFinal:number;
    notaFinal = ((notasParciales[0] + notasParciales[1] + notasParciales[2]) / 3) * 0.55 + (notaExamen * 0.3) + (trabajoFin * 0.15);
    console.log("Nota final: " + notaFinal)
}


let videojuegos:string[] = ["Zelda Breath of the Wild", "Mario Maker", "Elden Ring","Dark Souls", "Monster Hunter", "Mario 64"]

function noMario(){

    for(let game of videojuegos){
        if(!game.includes("mario") && !game.includes("Mario") && !game.includes("MARIO"))
        console.log(game)
    }
}

let num: number = 5

function factorial(){
    let sol: number = 1;
    for(let i = num; i > 0; --i) sol *= i;
    console.log("Factorial: ", sol);
}

calcularCalFin()

noMario()

factorial()
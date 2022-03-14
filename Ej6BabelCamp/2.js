window.onload = function(){
    let num1 = document.getElementById("num1")
    let num2 = document.getElementById("num2")
    let resultado = document.getElementById("resultado")

    document.getElementById("suma").onclick = function(){
        resultado.value = parseInt(num1.value) + parseInt(num2.value)
    }

    document.getElementById("resta").onclick = function(){
        resultado.value = parseInt(num1.value) - parseInt(num2.value)
    }

    document.getElementById("mult").onclick = function(){
        resultado.value = parseInt(num1.value) * parseInt(num2.value)
    }

    document.getElementById("div").onclick = function(){
        resultado.value = parseInt(num1.value) / parseInt(num2.value)
    }
}
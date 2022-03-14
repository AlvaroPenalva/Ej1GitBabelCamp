var array = []


window.onload = function () {

    document.getElementById("insertElem").onclick = function () {
        console.log(newElem.value)
        if (newElem.value != "") {
            array.push(parseInt(newElem.value));
        } else window.alert("Inserte algún elemento")
    }
    document.getElementById("getRandom").onclick = function () {
        document.getElementById("randomElem").value = array[Math.floor(Math.random() * array.length)]
    }
}
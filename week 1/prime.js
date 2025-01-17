fnaf = new Audio('audios/fnamf.mp3')
yay = new Audio('audios/yay.mp3')
a = new Audio('audios/2.mp3')
b = new Audio('audios/3.mp3')
c = new Audio('audios/4.mp3')
d = new Audio('audios/6.mp3')
boop = new Audio('audios/boop.mp3')
meow = new Audio('audios/meow.mp3')
boop = new Audio('audios/security.mp3')
sl = new Audio('audios/sl.mp3')
ambience = new Audio('audios/ambience.mp3')

document.getElementById("FormThing").addEventListener("submit", (prime) => {
    let number = document.getElementById("num").value
    number = parseInt(number)
    prime.preventDefault()

    if (number == 1) {
        audio()
        alert("NOT PRIME")
    }
    // im sorry i had to hard co de :(((((((((((((( i no understand why it doesnt startat 3 sorry soawrrryyy sorryyyyy 
    if (number == 2) {
        audio()
        alert("PRIME")
    }

    if (number == 3) {
        audio()
        alert("PRIME")
    }

    for (let i = 2; i <= Math.sqrt(number); i++){
       if (number % i === 0) {
        audio()
        alert("NOT PRIME")
        return
       }
    audio()
    alert("PRIME")
}})

function audio() {
    fnaf.play()
    yay.play()
    a.play()
    b.play()
    c.play()
    d.play()
    boop.play()
    meow.play()
    boop.play()
    sl.play()
    ambience.play()
}
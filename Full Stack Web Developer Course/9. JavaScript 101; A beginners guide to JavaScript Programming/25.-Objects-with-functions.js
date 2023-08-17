const person = {
    'name': 'Brandan-Lee',
    'age': 20,
    'height': "6'4\"",
    'speak': function(want = "cookies") {
        console.log(`Hello, I want ${want}`);
    },
    talk(to = "Aiden") {
        console.log(`I am talking to ${to}`);
    }
}

person.talk("Lyrisha");
person.speak("Pizza");
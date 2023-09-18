class Animal:
    fur_color = "Black"

    def speak(self, sound):
        print(sound)

class Tiger(Animal):
    def speak(self):
        print("They're great")

class Dog(Animal):
    fur_color = "Black"

    def speak(self):
        print("Bark")

tiger = Tiger()
tiger.speak()
dog = Dog()
dog.speak()
print(dog.fur_color)
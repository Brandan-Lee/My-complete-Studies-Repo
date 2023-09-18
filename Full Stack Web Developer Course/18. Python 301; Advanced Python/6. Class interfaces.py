#interface is just a blueprint

class Animal:
    fur_color = ""

    def speak(self):
        raise NotImplementedError

    def eat(self):
        raise NotImplementedError

    def chase(self):
        raise NotImplementedError

class Dog(Animal):
    def speak(self):
        print("Bark")

dog = Dog()
dog.speak()
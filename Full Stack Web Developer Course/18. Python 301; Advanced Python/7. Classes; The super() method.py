class Animal:
    def eat(self):
        print("I am eating")

    def chase(self, animal):
        print("I am chasing a", animal)

class Dog(Animal):
    def eat(self):
        #super will use the inherited class
        super().eat()
        print("I am eating a bone")

    
    def chase(self, animal):
        super().chase(animal)
        print(animal, "was caught")

dog = Dog()
dog.fur_color = "Black"
dog.eat()
dog.chase("Lizard")
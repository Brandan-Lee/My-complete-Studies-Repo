class Animal:
    animal_type = "Unknown"
    
    def __init__(self, fur_color):
        self.fur_color = fur_color

    def get_fur_color(self):
        print("Getting fur color: ", self.fur_color)

class Dog(Animal):
    def __init__(self, fur_color):
        super().__init__(fur_color)
        print("Fur color was saved to the class object")
        self.animal_type = "House Dog"
        print(self.animal_type)

dog = Dog("Black")
dog.get_fur_color()
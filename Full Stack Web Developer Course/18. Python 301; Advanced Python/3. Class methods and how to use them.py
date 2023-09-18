class Animal:
    list1 = ["Alexa", "Lola", "Lara"]

    def this_is_a_method(self):
        print(self.list1)

    @property
    def get_Alexa(self):
        return self.list1[0]
    
    def add_name(self, name):
        self.list1.append(name)
        return self.list1

animal = Animal()
animal.this_is_a_method()
alexa = animal.get_Alexa
print("The cutest dog of all time is", alexa)
animal.add_name("Jake")
print(animal.list1)
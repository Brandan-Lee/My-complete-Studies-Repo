class Animal:
    property = {
        "key1" : "Value 1"
    }
    list1 = ["Alexa", "Lola", "Lara"]
    _like_this = "This is a private property"

the_animal = Animal()
print(the_animal.property['key1'])
print(the_animal.list1[2])
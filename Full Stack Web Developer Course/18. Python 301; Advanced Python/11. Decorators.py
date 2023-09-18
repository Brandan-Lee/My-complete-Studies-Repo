def my_decorator(func):
    def wrapper():
        print("Do something here")
        func()
        print("Original function is finished")
    
    return wrapper

@my_decorator
def myFunc():
    print("My name is Brandan-Lee")

myFunc()
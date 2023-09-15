# def person(**kwargs):
#     print(kwargs)
#     print(type(kwargs))

#     if 'age' in kwargs:
#         print("Your age is ", kwargs.get("age"))

# person(name="Brandan", age=21, brain="Huge")

def order_pizza(name, address, **toppings):
    print(f"Order is for {name}")
    print(f"Ship it to {address}")
    price = 18.00

    for key, value in toppings.items():
        price = price + 2.00

    print(f"The total price is: {price}")
    return price

order_pizza("Brandan-Lee", "Strubensvalley", cheese=True, ham=True)
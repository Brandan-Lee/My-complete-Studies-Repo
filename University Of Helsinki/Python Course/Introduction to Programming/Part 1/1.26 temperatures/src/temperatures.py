#Please write a program which asks the user for a temperature in degrees Fahrenheit, and then prints out the
#  same in degrees Celsius. If the converted temperature falls below zero degrees Celsius, the program should
#  also print out "Brr! It's cold in here!".

# Write your solution here
temperature = int(input("Please type in a temperature (F): "))
celsius = (temperature - 32) * (5 / 9)

if celsius < 0:
    print(f"{temperature} degrees Fahrenheit equals {celsius} degrees Celsius")
    print("Brr! It's cold in here!")
else:
    print(f"{temperature} degrees Fahrenheit equals {celsius} degrees Celsius")

#examples of output
#temperature greater than 0 degrees celsius
#Please type in a temperature (F): 101
# 101 degrees Fahrenheit equals 38.333333333333336 degrees celsius

#temperature less than 0 degrees celsius
#Please type in a temperature (F): 21
# 21 degrees Fahrenheit equals -6.111111111111111 degrees celsius
# Brr! I'ts cold in here!
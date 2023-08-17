#Please write a program which asks for two integer numbers. The program should then print out whichever is
#  greater. If the numbers are equal, the program should print a different message.

# Write your solution here
num1 = int(input("Please type in the first number: "))
num2 = int(input("Please type in another number: "))

if num1 > num2:
    print(f"The greater number was: {num1}")
elif num2 > num1:
    print(f"The greater number was: {num2}")
else:
    print("The numbers are equal!")

#examples of output
#Please type in the first number: 5
# Please type in another number: 3
# The greater number was: 5

#Please type in the first number: 5
# Please type in another number: 8
# The greater number was: 8

#Please type in the first number: 5
# Please type in another number: 5
# The numbers are equal!
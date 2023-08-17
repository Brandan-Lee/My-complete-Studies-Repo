#Please write a program which asks the user to type in an integer number. If the user types in a number equal
#  to or below 0, the execution ends. Otherwise the program prints out the factorial of the number.

#The factorial of a number involves multiplying the number by all the positive integers smaller than itself. In
#  other words, it is the product of all positive integers less than or equal to the number. For example, the
#  factorial of 5 is 1 * 2 * 3 * 4 * 5 = 120.

# Write your solution here
#helper variables
number = 1
#loop while number > 0
while number > 0:
    number = int(input("Please type in a number: "))
    #helper variables
    factorial = 1
    a = 1
    #exit program if number <= 0
    if number <= 0:
        print("Thanks and bye!")
        break
    #nested loop: while a <= number
    while a <= number:
        factorial *= a
        #increment helper variable
        a += 1
    print(f"The factorial of the number {number} is {factorial}")

#examples of output
#Please type in a number: 3
# The factorial of the number 3 is 6
# Please type in a number: 4
# The factorial of the number 4 is 24
# Please type in a number: -1
# Thanks and bye!

#Please type in a number: 1
# The factorial of the number 1 is 1
# Please type in a number: 0
# Thanks and bye!


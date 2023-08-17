#Please write a program which asks asks the user for an integer number. If the number is divisible by three,
#  the program should print out Fizz. If the number is divisible by five, the program should print out Buzz.
#  If the number is divisible by both three and five, the program should print out FizzBuzz.

# Write your solution here
number = int(input("Number: "))

#check if number is divisible by 3. if so print Fizz
if number % 3 == 0 and number % 5 == 0:
    print("FizzBuzz")
#check if number is divisible by 5. if so print Buzz
elif number % 5 == 0:
    print("Buzz")
#check if number is divisible by 3 and 5. if so print FizzBuzz
elif number % 3 == 0:
    print("Fizz")

#examples of output
#Number: 9
# Fizz

#Number: 7

#Number: 20
# Buzz

#Number: 45 
# FizzBuzz
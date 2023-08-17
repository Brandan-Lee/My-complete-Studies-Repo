#When programming in Python, often we need to change the data type of a value.

#Please write a program which asks the user for a floating point number and then prints out the integer part
#  and the decimal part separately. Use the Python int function.

#You can assume the number given by the user is always greater than zero.

# Write your solution here
number = float(input("Please type in a number: "))
integer_part = int(number)
decimal_part = number - integer_part
print(f"Integer part: {integer_part}")
print(f"Decimal part: {decimal_part}")

#examples of output
#Please type in a number: 1.34
# Integer part: 1
# Decimal part: 0.3400000000000001
#Please write a program which asks the user for four numbers. The program then prints out the sum and the mean
#  of the numbers.

# Write your solution here
num1 = int(input("Number 1: "))
num2 = int(input("Number 2: "))
num3 = int(input("Number 3: "))
num4 = int(input("Number 4: "))
#add all numbers to get total sum
sum = num1 + num2 + num3 + num4
#divide the amount of numbers by sum to get mean
mean = sum / 4

print(f"The sum of the numbers is {sum} and the mean is {mean}")

#examples of output
#Number 1: 2
# Number 2: 1
# Number 3: 6
# Number 4: 7
# The sum of the numbers is 16 and the mean is 4.0

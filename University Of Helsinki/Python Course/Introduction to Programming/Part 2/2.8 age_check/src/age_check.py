#Please write a program which asks for the user's age. If the age is not plausible, that is, it is under 5 or
#  something that can't be an actual human age, the program should print out a comment.

# Write your solution here
#create interface
age = int(input("What is your age? "))

#check to see if age is plausible or not
if age >= 5:
    print(f"Ok, you're {age} years old")
#check to see if age is less than 5
elif age >=  0 and age < 5:
    print("I suspect you can't write quite yet...")
#else: doesn't make sense or is physically impossible
else:
    print("That must be a mistake")

#examples of output
#What is your age? 13
# Ok, you're 13 years old

#What is your age? 2
# I suspect you can't quite write yet...

#What is your age? -4
# That must be a mistake
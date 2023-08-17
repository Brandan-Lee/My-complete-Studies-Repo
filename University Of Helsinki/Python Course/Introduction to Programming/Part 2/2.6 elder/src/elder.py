#Please write a program which asks for the names and ages of two persons. The program should then print out the
#  name of the elder.

# Write your solution here
#create interface
print("Person 1:")
name1 = input("Name: ")
age1 = int(input("Age: "))
print("Person 2: ")
name2 = input("Name: ")
age2 = int(input("Age: "))

#check if person 1 is older than person 2
if age1 > age2:
    print(f"The elder is {name1}")
#check if person 2 is older than person 1
elif age2 > age1:
    print(f"The elder is {name2}")
#else persons are same age
else:
    print(f"{name1} and {name2} are the same age")

#examples of output
#Person 1:
# Name: Alan
# Age: 26
# Person 2: 
# Name: Ada
# Age: 27
# The elder is Ada

#Person 1:
# Name: Bill
# Age: 1
# Person 2: 
# Name: Jean
# Age: 1
# Bill and Jean are the same age
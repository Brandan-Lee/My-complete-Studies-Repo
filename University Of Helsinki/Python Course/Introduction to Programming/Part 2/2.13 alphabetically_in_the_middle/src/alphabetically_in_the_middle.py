#Please write a program which asks the user for three letters. The program should then print out whichever of 
# the three letters would be in the middle if the letters were in alphabetical order.

#You may assume the letters will be either all uppercase, or all lowercase.

# Write your solution here
#Create interface
l1 = input("1st letter: ")
l2 = input("2nd letter: ")
l3 = input("3rd letter: ")

#check to see if l1 is the middle
if ((l1 < l2 and l1 > l3) or (l1 > l2 and l1 < l3)):
    print(f"The letter in the middle is {l1}")
#check to see if l2 is the middle
elif ((l2 < l1 and l2 > l3) or (l2 > l1 and l2 < l3)):
    print(f"The letter in the middle is {l2}")
#if l1 and l2 ain't the middle, l3 is the middle
else:
    print(f"The letter in the middle is {l3}")

#examples of output
#1st letter: x
# 2nd letter: c
# 3rd letter: p
# The letter in the middle is p

#1st letter: A
# 2nd letter: c
# 3rd letter: B
# The letter in the middle is B
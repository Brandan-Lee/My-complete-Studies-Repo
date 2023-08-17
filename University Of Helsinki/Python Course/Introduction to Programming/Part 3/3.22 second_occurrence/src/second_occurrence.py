#Please write a program which finds the second occurrence of a substring. If there is no second (or first)
#  occurrence, the program should print out a message accordingly.

#In this exercise the occurrences cannot overlap. For example, in the string aaaa the second occurrence of the
#  substring aa is at index 2.

# Write your solution here
#create interface
string = input("Please type in a string: ")
substring = input("Please type in a substring: ")
#create variable for first index and find index, set second index to false
index1 = string.find(substring)
index2 = -1
#if first index is not false, find second occurrence of substring
if index1 != -1:
    index2 = string.find(substring, index1 + len(substring))

#if index2 is false, print appropriate message, else print message
if index2 == -1:
    print("The substring does not occur twice in the string. ")
else:
    print(f"The second occurrence of the substring is at index {index2}.")

#examples of output
#Please type in a string: abcabc
# Please type in a substring: ab 
# The second occurrence of the substring is at index 3

#Please type in a string: methodology
# Please type in a substring: o
# The second occurrence of the substring is at index 6.

#Please type in a string: aybabtu
# Please type in a substring: ba
# The substring does not occur twice in the string. 
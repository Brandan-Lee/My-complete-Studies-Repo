#Please write a program which first asks the user for the number of items to be added. Then the program
#  should ask for the given number of values, one by one, and add them to a list in the order they were
#  typed in. Finally, the list is printed out.

# Write your solution here
#create empty list
my_list = []
#create interface
items = int(input("How many items: "))
#create count variable
i = 1
#loop while i <= items
while i <= items:
    item = int(input(f"Item {i}: "))
    #add item to empty list
    my_list.append(item)
    i += 1
#print list
print(my_list)

#examples of output
# How many items: 3
# Item 1: 10
# Item 2: 250 
# Item 3: 34
# [10, 250, 34]
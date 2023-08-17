#Please write a program which asks the user to type in values and adds them to a list. After each addition,
#  the list is printed out in two different ways:

#in the order the items were added
# ordered from smallest to greatest
# The program exits when the user types in 0.

# Write your solution here
#create empty lists
my_list = []
#loop while true
while True:
    new_item = int(input("New item: "))
    #check to see if new item is 0
    if new_item == 0:
        print("Bye!")
        break
    #add to list
    my_list.append(new_item)
    #print output
    print(f"The list now: {my_list}")
    #print sorted list
    print(f"The list in order: {sorted(my_list)}")

#examples of output
# New item: 3
# The list now: [3]
# The list in order: [3]
# New item: 1
# The list now: [3, 1]
# The list in order: [1, 3]
# New item: 9
# The list now: [3, 1, 9]
# The list in order: [1, 3, 9]
# New item: 5
# The list now: [3, 1, 9, 5]
# The list in order: [1, 3, 5, 9]
# New item: 0
# Bye!
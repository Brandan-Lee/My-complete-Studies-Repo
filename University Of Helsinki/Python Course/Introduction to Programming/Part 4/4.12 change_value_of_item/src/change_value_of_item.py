#Please write a program which initialises a list with the values [1, 2, 3, 4, 5]. Then the program should
#  ask the user for an index and a new value, replace the value at the given index, and print the list
#  again. This should be looped over until the user gives -1 for the index. You can assume all given index
#  values will fall within your list.

# Write your solution here
#create list
my_list = [1, 2, 3, 4, 5]
#loop while True
while True:
    index = int(input("Index: "))
    #check to see if index == -1, if so, break
    if index == -1:
        break
    new_value = int(input("New value: "))
    #change value at index
    my_list[index] = new_value
    #print list
    print(my_list)

#examples of output
# Index: 0
# New value: 10
# [10, 2, 3, 4, 5]
# Index: 2
# New value: 250
# [10, 2, 250, 4, 5]
# Index: 4
# New value: -45
# [10, 2, 250, 4, -45]
# Index: -1
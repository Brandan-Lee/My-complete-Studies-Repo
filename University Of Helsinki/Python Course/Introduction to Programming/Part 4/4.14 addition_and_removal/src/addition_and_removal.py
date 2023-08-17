#Please write a program which asks the user to choose between addition and removal. Depending on the choice,
#  the program adds an item to or removes an item from the end of a list. The item that is added must always
#  be one greater than the last item in the list. The first item to be added must be 1.

#The list is printed out in the beginning and after each operation.

# Write your solution here
#create empty list
my_list = []
#create count variable
i = 1
#loop while i > 0
while i > 0:
    print(f"The list is now {my_list}")
    are = input("a(d)d, (r)emove or e(x)it: ")
    #check the user input
    if are.lower() == "x":
        print("Bye!")
        break
    #add to list
    if are.lower() == "d":
        my_list.append(i)
    #remove from list
    if are.lower() == "r":
        #-2 because we increment i with one at the end
        i -= 2
        my_list.pop()
    i += 1

#examples of output
# The list is now []
# a(d)d, (r)emove or e(x)it: d
# The list is now [1]
# a(d)d, (r)emove or e(x)it: d
# The list is now [1, 2]
# a(d)d, (r)emove or e(x)it: d
# The list is now [1, 2, 3]
# a(d)d, (r)emove or e(x)it: r
# The list is now [1, 2]
# a(d)d, (r)emove or e(x)it: d
# The list is now [1, 2, 3]
# a(d)d, (r)emove or e(x)it: x
# Bye!
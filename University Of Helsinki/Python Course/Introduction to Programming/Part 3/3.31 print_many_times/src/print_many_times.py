#Please write a function named print_many_times(text, times), which takes a string and an integer as arguments.
#  The integer argument specifies how many times the string argument should be printed out:

# Write your solution here
def print_many_times(text, times):
    #create count variable
    count = 1
    #loop while count <= times
    while count <= times:
        print(text)
        count += 1

# You can test your function by calling it within the following block
if __name__ == "__main__":
    print_many_times("python", 5)
    print()
    print_many_times("hi", 5)
    print()
    print_many_times("All Pythons, except one, grow up.", 3)

#examples of output
#python
# python
# python
# python
# python

#hi
# hi
# hi
# hi
# hi

#All Pythons, except one, grow up.
# All Pythons, except one, grow up.
# All Pythons, except one, grow up.
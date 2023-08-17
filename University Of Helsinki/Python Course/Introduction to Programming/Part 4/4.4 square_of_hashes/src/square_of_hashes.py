#Please write a function named square_of_hashes, which draws a square of hash characters. The function takes
#  one argument, which determines the length of the side of the square.

#The function should call the function line from the exercise above for the actual printing out. Copy your
#  solution to that exercise above the code for this exercise. Please don't change anything in the line
#  function.

# Copy here code of line function from previous exercise
def line(size, text):
    #check if text is an empty string
    if text == "":
        print("*" * size)
    else: 
        print(text[0] * size)

def square_of_hashes(size):
    # You should call function line here with proper parameters
    #create count variable
    i = 0
    #loop while i < size
    while i < size:
        line(size, "#")
        i += 1

# You can test your function by calling it within the following block
if __name__ == "__main__":
    square_of_hashes(5)
    print()
    square_of_hashes(3)

#examples of output
#####
#####
#####
#####
#####

###
###
###

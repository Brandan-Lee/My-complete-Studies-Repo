# Copy here code of line function from previous exercise
def line(size, text):
    #check if text is an empty string
    if text == "":
        print("*" * size)
    else: 
        print(text[0] * size)

def triangle(size):
    # You should call function line here with proper parameters
    #create count variable
    i = 1
    #loop while i < size
    while i <= size:
        line(i, "#")
        i += 1

# You can test your function by calling it within the following block
if __name__ == "__main__":
    triangle(5)
    print()
    triangle(6)
    print()
    triangle(3)

#examples of output
#
##
###
####
#####

#
##
###
####
#####
######

#
##
###

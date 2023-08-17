#Please write a function named formatted, which takes a list of floating point numbers as its
#  argument. The function returns a new list, which contains each element of the original list
#  in string format, rounded to two decimal points. The order of the items in the list should
#  remain unchanged.

#Hint: use f-strings to format the floating point numbers into suitable strings.

# Write your solution here
def formatted(list: float):
    #create empty list
    new_list = []
    #loop through list
    for i in list:
        #format new list so that it adds each index of list formatted to 2 decimal places
        new_list.append(f"{i:.2f}")
    #return new_list
    return new_list

#create main method
if __name__ == "__main__":
    my_list = [1.234, 0.3333, 0.11111, 3.446]
    new_list = formatted(my_list)
    print(new_list)

#example of output
# ['1.23', '0.33', '0.11', '3.45']
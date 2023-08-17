#The Python string method isupper() returns True if a string consists of only uppercase characters.

#Please use the isupper method to write a function named no_shouting, which takes a list of strings as an
#  argument. The function returns a new list, containing only those items from the original which do not
#  consist of solely uppercase characters.

# Write your solution here
#function removes all indexes containing all uppercase letters in the given list
def no_shouting(list: str):
    #create new list
    new_list = []
    #loop through list
    for i in list:
        #only add index that is not all capitalized characters
        if i.isupper() != True:
            #add i to new list
            new_list.append(i)
    #return new list
    return new_list

#create main method
if __name__ == "__main__":
    print("XYZ".isupper())
    is_it_upper = "Abc".isupper()
    print(is_it_upper)
    print()
    my_list = ["ABC", "def", "UPPER", "ANOTHERUPPER", "lower", "another lower", "Capitalized"]
    pruned_list = no_shouting(my_list)
    print(pruned_list)

#examples of output
# True
# False

# ['def', 'lower', 'another lower', 'Capitalized']
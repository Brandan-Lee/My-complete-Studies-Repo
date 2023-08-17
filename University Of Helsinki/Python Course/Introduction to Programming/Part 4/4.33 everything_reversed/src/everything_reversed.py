#Please write a function named everything_reversed, which takes a list of strings as its argument. The 
# function returns a new list with all of the items on the original list reversed. Also the order of items
#  should be reversed on the new list.

# Write your solution here
def everything_reversed(list: str):
    #create empty list
    new_list = []
    #reverse list
    reversed = list[::-1]
    #loop through list
    for i in reversed:
        #add list index to new list, but reversed
        new_list.append(i[::-1])
    #return new list
    return new_list

#create main method
if __name__ == "__main__":
    my_list = ["Hi", "there", "example", "one more"]
    new_list = everything_reversed(my_list)
    print(new_list)

#example of output
# ['erom eno', 'elpmaxe', 'ereht', 'iH']
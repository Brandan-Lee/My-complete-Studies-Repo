#Please write a function named shortest, which takes a list of strings as its argument. The function
#  prints out whichever of the strings is the shortest. If more than one are equally short, the
#  function can print out any of the shortest strings (there will be no such situation in the tests).
#  You may assume there will be no empty strings in the list.

# Write your solution here
def shortest(list):
    #create helper variable
    shortest_in_list = list[0]
    #loop through list
    for i in list:
        #check to see if length of i < shortest
        if len(i) < len(shortest_in_list):
            #update shortest
            shortest_in_list = i
    #return shortest word
    return shortest_in_list

#main method
if __name__ == "__main__":
    my_list = ["first", "second", "fourth", "eleventh"]
    result = shortest(my_list)
    print(result)
    
    my_list2 = ["adele", "mark", "dorothy", "tim", "hedy", "richard"]
    result2 = shortest(my_list2)
    print(result2)

#example of output
# first
# tim

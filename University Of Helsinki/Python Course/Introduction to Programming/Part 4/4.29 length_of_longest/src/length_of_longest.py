#Please write a function named length_of_longest, which takes a list of strings as its argument. The
#  function returns the length of the longest string.

# Write your solution here
def length_of_longest(list):
    #create helper variable
    longest = len(list[0])
    #loop through list
    for i in list:
        #check if length of i > longest
        if len(i) > longest:
            #update longest
            longest = len(i)
    #return longest
    return longest

#main method
if __name__ == "__main__":
    my_list = ["first", "second", "fourth", "eleventh"]
    result = length_of_longest(my_list)
    print(result)
    
    my_list2 = ["adele", "mark", "dorothy", "tim", "hedy", "richard"]
    result2 = length_of_longest(my_list2)
    print(result2)

#example of output
# 8
# 7
#Please write a function named all_the_longest, which takes a list of strings as its argument. The
#  function should return a new list containing the longest string in the original list. If more than
#  one are equally long, the function should return all of the longest strings.

#The order of the strings in the returned list should be the same as in the original.

# Write your solution here
def all_the_longest(list):
    #create empty list
    longest_list = []
    #create helper variable
    longest = len(list[0])
    #loop through list to find the length of the longest word
    for i in list:
        #check to see if the length of given index is greater or equal than the length of longest
        if len(i) > longest:
            #update longest
            longest = len(i)
    
    #loop through list to find longest word
    for i in list:
        #check to see if there is another word the same length as longest
        if len(i) == longest:
            #add longest word to longest list
            longest_list.append(i)
    #return longest list
    return longest_list

#main method
if __name__ == "__main__":
    my_list = ["first", "second", "fourth", "eleventh"]
    result = all_the_longest(my_list)
    print(result)
    
    my_list2 = ["adele", "mark", "dorothy", "tim", "hedy", "richard"]
    result2 = all_the_longest(my_list2)
    print(result2)

#example of output
# ['eleventh']
# ['dorothy', 'richard']
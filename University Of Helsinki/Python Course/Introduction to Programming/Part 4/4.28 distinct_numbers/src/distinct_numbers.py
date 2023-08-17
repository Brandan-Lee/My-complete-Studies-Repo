#Please write a function named distinct_numbers, which takes a list of integers as its argument. The
#  function returns a new list containing the numbers from the original list in order of magnitude,
#  and so that each distinct number is present only once.

# Write your solution here
def distinct_numbers(list):
    #create new list
    new_list = []
    #sort given list
    sorted_list = sorted(list)
    #loop through sorted list
    for i in sorted_list:
        #make sure that character only appears once in new list and adds it to new list
        if i not in new_list:
            new_list.append(i)
    #return new_list
    return new_list

#main method
if __name__ == "__main__":
    my_list = [3, 2, 2, 1, 3, 3, 1]
    print(distinct_numbers(my_list))

#example of output
# [1, 2, 3]
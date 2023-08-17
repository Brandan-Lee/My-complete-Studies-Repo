#Please write a function named list_sum which takes two lists of integers as arguments. The function
#  returns a new list which contains the sums of the items at each index in the two original lists.
#  You may assume both lists have the same number of items.

# Write your solution here
def list_sum(lst1, lst2):
    #create empty list
    new_lst = []
    #loop through lst1
    for i in range(len(lst1)):
        #count index of lst1 and lst2 together
        sum = lst1[i] + lst2[i]
        #add sum to new lst
        new_lst.append(sum)
        i += 1
    #return new lst
    return new_lst

#main method
if __name__ == "__main__":
    a = [1, 2, 3]
    b = [7, 8, 9]
    print(list_sum(a, b))

#example of output
# [8, 10, 12]
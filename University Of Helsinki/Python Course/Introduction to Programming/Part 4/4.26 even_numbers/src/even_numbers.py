#Please write a function named even_numbers, which takes a list of integers as an argument. The
#  function returns a new list containing the even numbers from the original list.

# Write your solution here
def even_numbers(lst):
    #create empty list
    new_lst = []
    #loop through lst
    for i in lst:
        #check to see if i is an even number... if so, add it to new lst
        if i % 2 == 0:
            new_lst.append(i)
    #return new lst
    return new_lst

#main method
if __name__ == "__main__":
    my_list = [1, 2, 3, 4, 5]
    new_list = even_numbers(my_list)
    print(f"original {my_list}")
    print(f"new {new_list}")

#example of output
# original [1, 2, 3, 4, 5]
# new [2, 4]
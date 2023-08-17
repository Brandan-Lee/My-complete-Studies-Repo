#Given a list of integers, let's decide that two consecutive items in the list are neighbours if their
#  difference is 1. So, items 1 and 2 would be neighbours, and so would items 56 and 55.

#Please write a function named longest_series_of_neighbours, which looks for the longest series of neighbours
#  within the list, and returns its length.

#For example, in the list [1, 2, 5, 4, 3, 4] the longest list of neighbours would be [5, 4, 3, 4], with a
#  length of 4.

# Write your solution here
#function returns the length of the longest series of neighbours
def longest_series_of_neighbours(my_list: list):
    longest = 1
    result = 1
    for i in range(1, len(my_list)):
        # function abs calculates the absolute value
        if abs(my_list[i-1]-my_list[i]) == 1:
            result += 1
        else:
            result = 1
        # function max returns the highest of the parameters
        longest = max(longest, result)
    return longest


#create main method
if __name__ == "__main__":
    my_list = [1, 2, 5, 7, 6, 5, 6, 3, 4, 1, 0]
    print(longest_series_of_neighbours(my_list))
Xtput
# 4
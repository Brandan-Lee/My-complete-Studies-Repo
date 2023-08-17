#Please write a function named same_chars, which takes one string and two integers as arguments. The
#  integers refer to indexes within the string. The function should return True if the two characters
#  at the indexes specified are the same. Otherwise, and especially if either of the indexes falls
#  outside the scope of the string, the function returns False.

# Write your solution here
#create same_chars function
def same_chars(string, int1, int2):
    #check if int1 and int2 is in index of string
    if int1 >= len(string) or int2 >= len(string):
        return False
    #check if characters at int1 and int2 is the same in string
    if string[int1] == string[int2]:
        return True
    else:
        return False
    
# You can test your function by calling it within the following block
if __name__ == "__main__":
    print(same_chars("coder", 1, 2))
    print(same_chars("programmer", 6, 7))
    print(same_chars("programmer", 0, 4))
    print(same_chars("programmer", 0, 12))

#examples of output
# False
# True
# False
# False
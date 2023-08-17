#Please write a function named most_common_character, which takes a string argument. The function returns the
#  character which has the most occurrences within the string. If there are many characters with equally many
#  occurrences, the one which appears first in the string should be returned.

# Write your solution here
def most_common_character(text: str):
    #create helper variable for later use to store the most common character in the text
    character = ""
    count_most_common_character = 0
    #loop through text
    for i in text:
        #check if character occurs more than once in string and is greater than the count of the most common
        #character
        if text.count(i) > count_most_common_character:
            #counts how many times i occurs in the text and sets it equal to the count of the most common character
            count_most_common_character = text.count(i)
            #sets i as the most common character in the string
            character = i
    #return character
    return character

#create main method
if __name__ == "__main__":
    first_string = "abcdbde"
    print(most_common_character(first_string))

    second_string = "exemplaryelementary"
    print(most_common_character(second_string))

#examples of output
# b 
# e
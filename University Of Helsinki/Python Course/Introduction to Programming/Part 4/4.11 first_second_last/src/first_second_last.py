#Please write three functions: first_word, second_word and last_word. Each function takes a string 
# argument.

#As their names imply, the functions return either the first, the second or the last word in the sentence
#  they receive as their string argument.

#In each case you may assume the argument string contains at least two separate words, and all words are
#  separated by exactly one space character. There will be no spaces in the beginning or at the end of the
#  argument strings.

# Write your solution here
#create first word function
def first_word(string):
    #split sentence into seperate words
    words = string.split(" ")
    return words[0]

#create second word function
def second_word(string):
    #split sentence into seperate words
    words = string.split(" ")
    return words[1]

#create last word function
def last_word(string):
    #split sentence into seperate words
    words = string.split(" ")
    return words[len(words) - 1]

# You can test your function by calling it within the following block
if __name__ == "__main__":
    sentence = "once upon a time there was a programmer"
    print(first_word(sentence))
    print(second_word(sentence))
    print(last_word(sentence))
    print()
    sentence2 = "it was a dark and stormy python"
    print(first_word(sentence2))
    print(second_word(sentence2))
    print(last_word(sentence2))
    print()
    sentence3 = "it was"
    print(first_word(sentence3))
    print(second_word(sentence3))
    print(last_word(sentence3))

#example of output
# once
# upon
# programmer

# it
# was
# python

# it
# was
# was
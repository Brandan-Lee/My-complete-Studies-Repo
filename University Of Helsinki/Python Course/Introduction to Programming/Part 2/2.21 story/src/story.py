#Part 1
#Please write a program which keeps asking the user for words. If the user types in end, the program should
#  print out the story the words formed, and finish.

#Part 2
#Change the program so that the loop ends also if the user types in the same word twice.

# Write your solution here
#create helper variable
story = ""
prev_word = ""

#iterate through loop and add user input to create a story
while True:
    word = input("Please type in a word: ")

    #if user enters end or prev_word = input, exit loop, else add word to story, add a space and set prev_word
    #equal to word
    if word == "end" or word == prev_word:
        break
    else:
        story += word
        story += " "
        prev_word = word

print(story)

#examples of output
#1
#Please type in a word: Once
# Please type in a word: upon
# Please type in a word: a
# Please type in a word: time
# Please type in a word: there
# Please type in a word: was
# Please type in a word: a 
# Please type in a word: girl
# Please type in a word: end
# Once upon a time there was a girl 

#2
#Please type in a word: It 
# Please type in a word: was
# Please type in a word: a
# Please type in a word: dark
# Please type in a word: and
# Please type in a word: stormy
# Please type in a word: night
# Please type in a word: night
# It was a dark and stormy night 


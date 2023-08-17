#Please write a program which asks the user for words. If the user types in a word for the second time, the
#  program should print out the number of different words typed in, and exit.

# Write your solution here
#create empty list
my_list = []
#loop while true
while True:
    word = input("Word: ")
    #check to see if word is in the list
    if word in my_list:
        print(f"You typed in {len(my_list)} different words")
        break
    #if not... add to list
    else:
        my_list.append(word.lower())

#examples of output
# Word: once 
# Word: upon
# Word: a 
# Word: time
# Word: upon
# You typed in 4 different words
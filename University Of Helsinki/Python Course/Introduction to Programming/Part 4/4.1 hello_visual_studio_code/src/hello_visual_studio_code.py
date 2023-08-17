#Please write a program which asks the user which editor they are using. The program should keep on asking
#  until the user types in Visual Studio Code.

#If the user types in Word or Notepad, the program counters with awful. Other unacceptable editor choices
#  receive the reply not good.

#The program should be case-insensitive in its reactions. That is, the same user input in lowercase, uppercase
#  or mixed case should trigger the same reaction:

# Write your solution here
#create count variable
i = 0
#loop while true
while True:
    editor = input("Editor: ")
    #check editor input and set characters to lower case
    if editor.lower() == "visual studio code":
        print("an excellent choice!")
        break
    elif editor.lower() == "notepad" or editor.lower() == "word":
        print("awful")
    else:
        print("not good")

#examples of output
#Editor: Emacs
# not good
# Editor: Vim
# not good
# Editor: Word
# awful
# Editor: Atom
# not good
# Editor: Visual Studio Code
# an excellent choice!

#Editor: NOTEPAD
# awful
# Editor: viSUal STudiO cODe  
# an excellent choice!
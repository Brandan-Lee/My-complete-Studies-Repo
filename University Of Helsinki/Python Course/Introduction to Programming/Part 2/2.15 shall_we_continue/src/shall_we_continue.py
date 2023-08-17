#Let's create a program along the lines of the example above. This program should print out the message "hi"
#  and then ask "Shall we continue?" until the user inputs "no". Then the program should print out "okay then"
#  and finish.

# Write your solution here
#create interface
print("hi")
#create loop to iterate over interface
while True:
    cont = input("Shall we continue? ")

    #if cont = no, break. else continue to say hi
    if cont == "no":
        #print okay then before the loop has been terminated
        print("okay then")
        break 
    else: 
        print("hi")

#examples of output
#hi
# Shall we continue? yes
# hi
# Shall we continue? oui
# hi
# Shall we continue? jawohl
# hi
# Shall we continue? no
# okay then


#Please write a program which keeps asking the user for a PIN code until they type in the correct one, which
#  is 4321. The program should then print out the number of times the user tried different codes.

# Write your solution here
#create helper variable
attempts = 0
correct = False

#iterate through loop until pin is correct. 
while True:
    pin = int(input("PIN: "))
    attempts += 1

    if pin == 4321:
        if attempts == 1:
            print("Correct! It only took you one single attempt!")
            break
        else:
            print(f"Correct! It took you {attempts} attempts")
            break
    else:
        print("Wrong") 

#examples of output
# PIN: 3245
# Wrong
# PIN: 1234
# Wrong
# PIN: 0000
# Wrong
# PIN: 4321 
# Correct! It took only 4 attempts  



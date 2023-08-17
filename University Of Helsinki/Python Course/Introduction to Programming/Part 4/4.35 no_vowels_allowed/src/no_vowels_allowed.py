#Please write a function named no_vowels, which takes a string argument. The function returns a new string,
#  which should be the same as the original but with all vowels removed.

#You can assume the string will contain only characters from the lowercase English alphabet a...z.

# Write your solution here
def no_vowels(text: str):
    #create a new empty string
    new_string = ""
    #loop through text
    for i in text.lower():
        #makes sure that vowels are not in text
        if i not in ["a", "e", "i", "o", "u"]:
            #creates the new string without any vowels
            new_string += i
    return new_string

#create main method
if __name__ == "__main__":
    my_string = "this is an example"
    print(no_vowels(my_string))

#examples of output
# ths s n xmpl
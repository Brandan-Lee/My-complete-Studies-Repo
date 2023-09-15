with open("writing_files.txt", "w") as file:
    file.write("Hello 2")

with open("writing_files.txt", "a") as file:
    file.write("\nA second line")
    file.write("\n\tA second line")
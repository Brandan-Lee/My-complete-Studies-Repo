#Please write a program which asks for the number of students on a course and the desired group size. 
# The program will then print out the number of groups formed from the students on the course. If the division
#  is not even, one of the groups may have fewer members than specified.

# Write your solution here
amount_students = int(input("How many students on the course? "))
desired_group_size = int(input("Desired group size? "))
groups = amount_students // desired_group_size
left = amount_students % desired_group_size
if left:
    print(f"Number of groups formed: {groups + 1}")
else:
    print(f"Number of groups formed: {groups}")

#examples of output
#groups can be evenly divided

#How many students on the course? 8
# Desired group size? 4
# Number of groups formed: 2

#groups can't be evenly divided

#How many students on the course? 11
# Desired group size? 3
# Number of groups formed: 4
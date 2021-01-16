import cProfile

def calculateGrade(grade):
    if (grade >= 75):
        return "O"
    elif (grade < 75 and grade >= 60):
        return "A"
    elif (grade < 60 and grade >= 50):
        return "B"
    elif (grade < 50 and grade >= 40):
        return "C"
    elif (grade < 40):
        return "D"


grade = int(input("Enter the marks of the student: "))

print(f"\nThe grade is: {calculateGrade(grade)}")


# I declare that my work contains no examples of misconduct, such as plagiarism, or collusion.
# Any code taken from other sources is referenced within my code solution.
# Student ID: W1986734
# Date: 20/04/2023

# Function to check if integer is within range
def range_check(integer, category):
    while integer % 20 != 0 or integer > 120 or integer < 0:
            print("Out of range")
            integer = int(input(f"Please enter your credits at {category}: "))

    return integer


# Function to determine student progression outcome
def progression_outcome(pass_marks, fail_marks):
    if pass_marks == 120:
        return "Progress"
    elif pass_marks == 100:
        return "Progress (module trailer)"
    elif fail_marks >= 80:
        return "Exclude"
    else:
        return "Module retriever"


# Initializing the dictionary to store the student progression
student_progression_dict = {}


def main():

    while True:
        student_id = input("Please enter the student ID: ")

        # Check if the student ID is already in the dictionary and validity of ID
        if student_id in student_progression_dict:
            print("Data already exists for this student ID.")
            continue
        elif len(student_id) != 8:
            print("ID must have 8 characters, eg - w1234567")
            continue

        try:
            pass_credits = int(input("Please enter your credits at pass: "))
            pass_credits = range_check(pass_credits, "pass")

            defer_credits = int(input("Please enter your credits at defer: "))
            defer_credits = range_check(defer_credits, "defer")

            fail_credits = int(input("Please enter your credits at fail: "))
            fail_credits = range_check(fail_credits, "fail")

            total = pass_credits + defer_credits + fail_credits

            if total != 120:
                print("Total incorrect")
            else:
                result = progression_outcome(pass_credits, fail_credits)
                print(result)

                # Add the student data to the dictionary
                student_progression_dict[student_id] = {
                    "pass": pass_credits,
                    "defer": defer_credits,
                    "fail": fail_credits,
                    "outcome": result
                }

            response = input("Would you like to enter another set of data?\n"
                             "Enter 'y' for yes or 'q' to quit and view results: ").lower()

            if response == 'q':
                break

        except ValueError:
            print("Integer required")

    # Print the student data
    print("Students' progression:")
    for student_id, data in student_progression_dict.items():
        print(f"{student_id} : {data['outcome']} - {data['pass']}, {data['defer']}, {data['fail']}")


main()

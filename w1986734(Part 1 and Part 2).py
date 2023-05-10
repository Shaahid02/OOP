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


# Dictionary to keep count of student progressions in each category
progress_count = {
    "Progress": 0,
    "Progress (module trailer)": 0,
    "Module retriever": 0,
    "Exclude": 0,
    "outcome": 0
}

# Initializing lists to store relevant data
progress_outcome_list = []
progress_credits_list = []


def main():

    while True:

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
                progress_count[result] += 1
                progress_count["outcome"] += 1

                marks = [pass_credits, defer_credits, fail_credits]

                progress_outcome_list.append(result)
                progress_credits_list.append(marks)

            response = input("Would you like to enter another set of data?\n"
                             "Enter 'y' for yes or 'q' to quit and view results: ").lower()

            if response == 'q':
                break

        except ValueError:
            print("Integer required")

    # Histogram

    print("\n---------------------------------------------------------------")
    print("Histogram")

    print(f"Progress {progress_count['Progress']} : {'*' * progress_count['Progress']}")
    print(f"Trailer {progress_count['Progress (module trailer)']} : {'*' * progress_count['Progress (module trailer)']}")
    print(f"Retriever {progress_count['Module retriever']} : {'*' * progress_count['Module retriever']}")
    print(f"Excluded {progress_count['Exclude']} : {'*' * progress_count['Exclude']}")
    print(f"{progress_count['outcome']} outcomes in total")

    print("---------------------------------------------------------------")

    # List, zip function allows to select one item from each list simultaneously

    for outcome, marks in zip(progress_outcome_list, progress_credits_list):
        print(f"{outcome} - {marks[0]}, {marks[1]}, {marks[2]}")

    # https://stackoverflow.com/questions/68877387/how-to-run-a-python-nested-for-loop-outer-loop-only-once


main()

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

                # enters data to text file
                with open('text.txt', 'a') as file:
                    file.write(f"{result} - {pass_credits}, {defer_credits}, {fail_credits} \n")

            response = input("Would you like to enter another set of data?\n"
                             "Enter 'y' for yes or 'q' to quit and view results: ").lower()

            if response == 'q':
                break

        except ValueError:
            print("Integer required")

    # Histogram

    print("\n---------------------------------------------------------------")
    print("Histogram")

    outcome_list = ["Progress", "Trailer", "Retriever", "Excluded"]

    # zip function allows to select one item/value each from list, dictionary simultaneously

    for outcome, (progress, count) in zip(outcome_list, progress_count.items()):
        print(f"{outcome} {count}: {'*' * count}")
    print(f"{progress_count['outcome']} outcomes in total")

    # https://stackoverflow.com/questions/41624308/zipping-a-python-dictionary-and-list-together
    print("---------------------------------------------------------------")

    # Reading and displaying text file
    with open('text.txt', 'r') as file:
        lines = file.read()
        print(lines)


main()

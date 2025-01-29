# PALINDORME

user_input = input("\nEnter anything ...... ANYTHING GGGG :))))))) or press e to exit\n").lower()

def referse(user_input):

    while user_input != 'e':

        # Takes the reverse index of the string, reversing it to check if it's a palindrome
        if user_input[::-1] == user_input:
            print("\nPALDINROME!!!!! :3 :3 :3 ")
            print('🐈🐈🐈🐈🐈🐈🐈')
            user_input = input("\nEnter anything ...... ANYTHING GGGG :))))))) or press e to exit\n")

        else:
            print("\nThis... is... NOT A PALINDROME!!!!!!!!!!! 😡😡😡🤬🤬🤬🤬🤬")
            user_input = input("\nEnter anything ...... ANYTHING GGGG :))))))) or press e to exit\n")

referse(user_input)
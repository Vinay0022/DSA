correct = "me"
tries = 0

KeepGoing = True

while (KeepGoing):
    tries = tries +1
    print("try ",tries)

    guess = input("What is your password? ")
    if guess == correct:
        print("That's correct! here's the treasure")
        KeepGoing = False

    elif tries>=3:
        print("Too many wrong tries")
        KeepGoing= False

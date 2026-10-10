# function definition
def foo():
    print('Hello')
    return False

print(True or foo())

print(False and foo())

print("bye")
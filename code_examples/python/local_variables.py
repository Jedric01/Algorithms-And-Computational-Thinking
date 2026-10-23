name = 'Alex'

def bar():
    name = 'Charlie'
    print(name)


def foo():
    name = 'Bob'
    print(name)
    bar()

if __name__ == '__main__':
    foo()
    print("local_variables is being executed!")
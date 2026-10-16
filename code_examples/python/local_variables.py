name = 'Alex'

def bar():
    name = 'Charlie'
    print(name)


def foo():
    name = 'Bob'
    print(name)
    bar()

foo()
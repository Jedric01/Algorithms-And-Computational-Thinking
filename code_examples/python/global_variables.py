name = 'Alex'

def foo():
    name = 'Bob'
    print(name)
    

print("outside of the function before calling foo: " + name)
foo()
print("outside of the function after calling foo: " + name)

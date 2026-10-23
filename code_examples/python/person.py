import local_variables

# blueprint
class Person:

    def __init__(self, name, height, age):
        self.name = name
        self.height = height
        self.__age = age

    def exercise(self, time):
        print(self.name + ' is exercising... at ' + time)
        print(self.__age)

    def rest(self):
        print('Resting...')

# instance
p1 = Person("Alex", 175, 28)

p2 = Person("Bob", 165, 23)

print(p1.name, p1.height)
print(p1.height)
# print(p1.__age)

p1.exercise('12:00')
p2.exercise('14:00')
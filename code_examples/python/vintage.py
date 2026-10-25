
class Medium:

    def __init__(self, title):
        self.title = title
        self.rating = -1

    def rate(self, rating):
        self.rating = rating
        
    def printInfo(self):
        rating = "?"
        if self.rating >= 0:
          rating = ""
        for i in range(0, self.rating):
            rating = rating + "*"
        print("Medium[title: {0} | rating: {1}]".format(self.title, rating))

class Book(Medium):
    
    def __init__(self, title, author):
        self.author = author
        super().__init__(title)

    def read(self):
        print("reading...")

    def printInfo(self):
        super().printInfo()
        print("This is a book! Author:", self.author)

class Vinyl(Medium):

    def __init__(self, title, artist, duration):
        self.artist = artist
        self.duration = duration
        super().__init__(title)

    def printInfo(self):
        print("This is a vinyl! Artist:", self.artist) 
        super().printInfo()

b1 = Book("HP", "JK")
v1 = Vinyl("vinly1", "artist-a", 30)

b1.printInfo()

v1.printInfo()
        
    
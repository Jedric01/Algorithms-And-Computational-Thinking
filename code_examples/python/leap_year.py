import sys

def leap(year):
    return year % 4 == 0
    
if __name__ == "__main__":
    print(len(sys.argv))

    if len(sys.argv) == 1:
        print('Please enter a year as a command line argument!')
    else:
        print(type(sys.argv[1]))
        print(leap(int(sys.argv[1])))



    # if len(sys.argv) == 1:
    #     print("Pass a year as argument on the command line!")
    # else:
    #     year = int(sys.argv[1])
    #     print("leap({0}) = {1}".format(year,leap(year)))
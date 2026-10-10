import sys
    
if __name__ == "__main__":
    # need to get command line arguments

    # print(sys.argv)
    if len(sys.argv) != 3:
        print("Please enter 2 numbers!")
    else:

        num1 = float(sys.argv[1])
        num2 = float(sys.argv[2])

        if num1 > 0 and num1 < 1 and num2 > 0 and num2 < 1:
            print(True)
        else:
            print(False)


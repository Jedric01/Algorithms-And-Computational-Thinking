balance = 100000

# written by professor
def withdraw(amount):
    global balance
    2 / 0
    if amount > balance:
        raise ValueError("insufficient balance")
    else:
        balance = balance - amount

amount = 500

try:
    print('hello!')
    withdraw(amount)
    print('bye')
    #...
except ValueError:
    print("Error in withdrawing")
    print(f"you cannot withdraw {amount} with a balance of {balance}")
except ZeroDivisionError as err:
    print("cannot divide by 0!")
    print(err)
finally:
    print('in finally')
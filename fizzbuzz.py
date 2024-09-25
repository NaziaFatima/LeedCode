def fizzBuzz(n):
    for n in range(1, n+1):
        fac_3 = n%3
        fac_5 = n%5
        if fac_3==0 and fac_5!=0:
            print("Fizz")
        if fac_3!=0 and fac_5 ==0:
            print("Buzz")
        if fac_3==0 and fac_5 ==0:
            print("FizzBuzz")
        if fac_3!=0 and fac_5!=0:
            print(n)

fizzBuzz(15)
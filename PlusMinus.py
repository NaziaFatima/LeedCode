def plusminus(arr):
    pos = neg = z = 0
    arr_length = len(arr)
    for i in arr:
        if i==0:
            z+=1
        elif i>0:
            pos+=1
        elif i<0:
            neg+=1
    print(format(float(pos/arr_length), '.6f'))
    print(format(float(neg/arr_length), '.6f'))
    print(format(float(z/arr_length), '.6f'))
q = [1,1,0,-1,-1]

plusminus(q)
def findZigZagSequence(a, n):
    a.sort()
    mid = int((n + 1)/2)
    a[mid], a[n-1] = a[n-1], a[mid]

    ed = mid+1
    st = n - 1
    while(st<=ed):
        a[st], a[ed] = a[ed], a[st]
        st = st + 1
        ed = ed + 1

    for i in range(n):
        if i == n-1:
            print(a[i])
        else:
            print(a[i], end=' ')
    return

for cs in range(7):
    n = int(1)
    a = list(map(int, range(1,8)))
    findZigZagSequence(a, n)




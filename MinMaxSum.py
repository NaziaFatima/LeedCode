def miniMaxSum(arr):
    min = max = arr[0]
    min_sum = max_sum= 0
    min_index = max_index = 0
    for i, val in enumerate(arr):
        if val < min: 
            min=val
            min_index=i
        if  val > max:
            max = val
            max_index = i

    for i, val in enumerate(arr):
        if i !=max_index:
            min_sum+=val
        if i !=min_index:
            max_sum+=val
    print(f"{min_sum} {max_sum}")

arr = [1,2,3,4,5]
miniMaxSum(arr)
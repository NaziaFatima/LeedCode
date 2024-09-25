#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumSwaps function below.
def minimumSwaps(arr):
    n = len(arr)
    # Create a list of tuples where each tuple is (value, index)
    arr_pos = [(value, index) for index, value in enumerate(arr)]
    
    # Sort the list based on the values
    arr_pos.sort(key=lambda x: x[0])
    
    # To track visited elements
    visited = [False] * n
    swaps = 0
    
    for i in range(n):
        # If already visited or in the right place, skip
        if visited[i] or arr_pos[i][1] == i:
            continue
        
        # Find the size of the cycle
        cycle_size = 0
        j = i
        
        while not visited[j]:
            visited[j] = True
            # Move to the next index in the cycle
            j = arr_pos[j][1]
            cycle_size += 1
        
        # If there is a cycle of size `cycle_size`, we need `cycle_size - 1` swaps
        if cycle_size > 0:
            swaps += (cycle_size - 1)
    
    return swaps
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()

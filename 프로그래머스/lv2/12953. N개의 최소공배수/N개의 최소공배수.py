# from functools import reduce
import math
def solution(arr):
    # mul = reduce(lambda x,y : x*y, arr)
    k = arr[0]
    for i in range(1, len(arr)):
        print(k, i, arr[i])
        k = k * arr[i] // math.gcd(k, arr[i])
        # k = math.gcd(k, arr[i])
        print(k)
    return k
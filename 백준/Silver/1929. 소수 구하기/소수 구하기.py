# 소수 구하기

import sys

line = sys.stdin.readline
m, n = map(int, line().split())

flag = [True for x in range(0, n+1)]
flag[0] = False 
flag[1] = False
i = 2
while i <= n/2:
    j = i*2
    while j <= n:
        flag[j] = False
        j += i
    i += 1
        
i = m
while i <= n:
    if flag[i] == True:
        print(i)
    i += 1
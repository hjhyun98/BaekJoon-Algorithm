# 소수 찾기
import sys

n = int(input())
read = sys.stdin.readline
data = list(map(int, read().split()))

count = 0
flag = 1
for m in data:
    if m == 1: 
        continue
    for i in range(2, m):
        if(m % i == 0):
            flag = 0
            break
    if flag == 1:
        count += 1
    flag = 1
             
print(count)
    
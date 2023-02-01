# 최대공약수와 최소공배수
import sys
read = sys.stdin.readline
a, b = map(int, read().split())

# 최대 공약수 
for i in range(min(a,b),0,-1):
    if a%i == 0 and b%i == 0:
        break

print(i)

# 최소 공배수
print(i*(a//i)*(b//i))
# 나머지 
import sys

read = sys.stdin.readline
a, b, c = map(int, read().split())

print((a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c)%c),sep='\n')
    
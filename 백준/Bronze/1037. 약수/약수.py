
import sys

num = int(input())
i = 0
read = sys.stdin.readline
data = list(map(int, read().split()))
data.sort()
print(data[0]*data[len(data)-1])
import sys

read = sys.stdin.readline()
e, s, m = map(int, read.split())

list = [e,s,m]
ans = [0,0,0]
answer = 0
while ans != list:
    for i in range(3):
        ans[i] += 1
    answer += 1
    if ans[0] > 15:
        ans[0] = 1
    if ans[1] > 28:
        ans[1] = 1
    if ans[2] > 19:
        ans[2] = 1

print(answer)
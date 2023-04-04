import sys

def find_k(m,n,x,y):
    k = x
    while k <= n*m:
        if (k-x) % m == 0 and (k-y) % n == 0:
            return k
        k += m
    return -1

t = int(sys.stdin.readline())

for i in range(t):
    read = sys.stdin.readline()
    m, n, x, y = map(int, read.split())
    print(find_k(m,n,x,y))


def solution(x, n):
    if x <= 0:
        return [i*x for i in range(1,n+1)]
    else:
        return [i for i in range(x, x*n+1, x)]
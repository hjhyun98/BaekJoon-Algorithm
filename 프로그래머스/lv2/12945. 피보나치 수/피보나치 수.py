def solution(n):
    fibo = [0, 1]+[-1 for i in range(2, n+1)]
    for i in range(n+1):
        if fibo[i] != -1:
            continue
        else:
            fibo[i] = fibo[i-1] + fibo[i-2]
    return fibo[i] % 1234567
            
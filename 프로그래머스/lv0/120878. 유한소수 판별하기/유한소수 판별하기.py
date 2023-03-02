def solution(a, b):
    for i in range(2,max(a,b)):
        if a % i == 0 and b % i == 0:
            a //= i
            b //= i
    print(a,b)
    for i in range(2, b+1):
        if b % i == 0:
            if i % 2 == 0 or i % 5 == 0:
                continue
            else:
                return 2
    return 1
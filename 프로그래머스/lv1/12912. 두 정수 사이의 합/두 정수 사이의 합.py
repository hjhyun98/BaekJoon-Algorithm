def solution(a, b):
    if a < b:
        return sum([i for i in range(a, b+1)])
    elif a==b:
        return a
    else:
        return sum([i for i in range(b, a+1)])
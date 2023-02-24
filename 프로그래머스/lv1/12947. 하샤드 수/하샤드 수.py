def solution(x):
    n = sum(i for i in map(int,list(str(x))))
    if x % n ==0:
        return True
    else:
        return False
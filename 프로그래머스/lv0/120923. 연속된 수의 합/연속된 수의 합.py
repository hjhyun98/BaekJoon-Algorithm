def solution(num, total):
    k = total // num
    if num % 2 == 1:
        return [i for i in range(k-num//2, k+num//2+1)]
    else:
        return [i for i in range(k-num//2+1, k+num//2+1)]
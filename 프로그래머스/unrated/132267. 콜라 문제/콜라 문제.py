def solution(a, b, n):
    answer = 0
    temp = 0
    while n >= a:
        temp = 0
        if n % a != 0:
            temp = n % a
        n = (n // a) * b
        answer += n
        n += temp
    return answer
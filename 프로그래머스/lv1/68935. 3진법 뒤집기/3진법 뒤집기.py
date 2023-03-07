def solution(n):
    l = []
    while n > 0:
        l.append(n % 3)
        n //= 3
    answer = 0
    for i in l:
        answer = answer*3+i
    return answer
        
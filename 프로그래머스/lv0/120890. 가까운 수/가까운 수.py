def solution(array, n):
    k = 999
    answer = 0
    for i in array:
        if k > abs(n-i):
            k = abs(n-i)
            answer = i
        elif k == abs(n-i):
            if answer > i:
                answer = i
    return answer
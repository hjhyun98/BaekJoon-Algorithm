def solution(s):
    answer = 0
    r = s.split()
    temp = 0
    for i in r:
        if i == 'Z':
            answer -= temp
        else:
            temp = int(i)
            answer += temp
    return answer
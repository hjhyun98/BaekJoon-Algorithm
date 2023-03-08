def solution(s):
    cnt = 0
    answer = ''
    for i in s:
        if i == ' ':
            cnt = -1
        if cnt == 0 or cnt % 2 == 0:
            answer += i.upper()
        else:
            answer += i.lower()
        cnt += 1
    return answer
def solution(s):
    answer = 0
    x = s[0]
    cnt_x = 0
    cnt_not_x = 0
    for i in s:
        if x == 1:
            x = i
            cnt_x += 1
        elif i != x:
            cnt_not_x += 1
        else:
            cnt_x += 1
        if cnt_not_x == cnt_x:
            answer += 1
            x = 1
            cnt_x = 0
            cnt_not_x = 0
    if cnt_not_x != cnt_x:
        answer += 1
    return answer

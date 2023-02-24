def solution(my_str, n):
    answer = []
    cnt = 0
    s = ""
    for i in my_str:
        s += i
        cnt += 1
        if cnt == n:
            cnt = 0
            answer.append(s)
            s = ""
    if cnt != 0:
        answer.append(s)
    return answer
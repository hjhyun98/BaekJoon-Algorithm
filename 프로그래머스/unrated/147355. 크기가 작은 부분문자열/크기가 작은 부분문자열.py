def solution(t, p):
    answer = 0
    for i in range(len(t)):
        if i+len(p) > len(t):
            break
        elif int(t[i:i+len(p)]) <= int(p):
            answer += 1
    return answer
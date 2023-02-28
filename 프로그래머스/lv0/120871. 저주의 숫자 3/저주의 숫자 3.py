def solution(n):
    answer = []
    temp = 1
    while len(answer) < n:
        if temp % 3 == 0 or str(temp).count("3") > 0:
            temp += 1
            continue
        else:
            answer.append(temp)
            temp += 1
    return answer[n-1]
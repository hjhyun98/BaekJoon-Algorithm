def solution(dartResult):
    answer = []
    idx = 0
    for i in range(len(dartResult)):
        if not dartResult[i].isdigit():
            if dartResult[i] == "S":
                answer.append(int(dartResult[idx:i]))
            elif dartResult[i] == "D":
                answer.append(int(dartResult[idx:i])**2)
            elif dartResult[i] == "T":
                answer.append(int(dartResult[idx:i])**3)
            elif dartResult[i] == "*":
                if len(answer)-1 > 0:
                    answer[len(answer)-2] *= 2
                answer[len(answer)-1] *= 2
            elif dartResult[i] == "#":
                answer[len(answer)-1] *= -1
            idx = i+1
            
    return sum(answer)
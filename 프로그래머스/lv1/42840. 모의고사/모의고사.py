def solution(answers):
    a = [1,2,3,4,5]*(len(answers)//5+1)
    b = [2,1,2,3,2,4,2,5]*(len(answers)//8+1)
    c = [3,3,1,1,2,2,4,4,5,5]*(len(answers)//10+1)
    score = [0,0,0]
    
    for i in range(len(answers)):
        if answers[i] == a[i]:
            score[0] += 1
        if answers[i] == b[i]:
            score[1] += 1
        if answers[i] == c[i]:
            score[2] += 1
    
    result = []
    m = max(score)
    result.append(score.index(m)+1)
    if score.count(m) > 1:
        score[score.index(m)] = 0
        while score.count(m) > 0:
            result.append(score.index(m)+1)
            score[score.index(m)] = 0
    return result
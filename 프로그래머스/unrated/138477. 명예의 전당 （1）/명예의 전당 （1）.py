def solution(k, score):
    answer = []
    l = []
    for i in range(len(score)):
        if len(l) < k:
            l.append(score[i])
        else:
            for j in range(k):
                if score[i] > l[j]:
                    del l[-1]
                    l.append(score[i])
        l.sort(reverse=True)
        answer.append(l[-1])
    return answer
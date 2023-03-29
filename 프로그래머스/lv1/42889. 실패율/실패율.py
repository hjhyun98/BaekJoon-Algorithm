def solution(N, stages):
    num_user = len(stages)
    l = []
    for i in range(1, N+1):
        k = stages.count(i)
        if k != 0:
            l.append(k/num_user)
            num_user -= k
        else:
            l.append(0)
    return [i+1 for i in sorted(range(len(l)), key=lambda k:l[k], reverse=True)]

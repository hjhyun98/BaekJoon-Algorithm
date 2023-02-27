def solution(spell, dic):
    flag = 0
    for i in dic:
        for j in spell:
            if i.count(j):
                flag += 1
            else:
                flag = -1
        if flag == len(spell):
            return 1
        flag = 0
    return 2
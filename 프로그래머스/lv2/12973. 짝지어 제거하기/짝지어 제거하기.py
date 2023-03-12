def solution(s):
    l = []
    for i in s:
        l.append(i)
        if len(l) < 2:
            continue
        elif l[-2] == i:
            del l[-2:]
    if len(l) != 0:
        return 0
    else:
        return 1
        
        
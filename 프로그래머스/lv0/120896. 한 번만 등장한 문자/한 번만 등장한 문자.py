def solution(s):
    l = []
    for i in s:
        if s.count(i) == 1:
            l.append(i)
    return ''.join(sorted(l))
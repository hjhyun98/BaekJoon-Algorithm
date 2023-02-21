def solution(s):
    p = s.count('P')+s.count('p')
    y = s.count('Y')+s.count('y')
    return False if p != y else True

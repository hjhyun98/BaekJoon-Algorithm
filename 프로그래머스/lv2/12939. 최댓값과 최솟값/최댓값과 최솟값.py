def solution(s):
    ls = list(map(int, s.split()))
    ls.sort()
    return str(ls[0])+" "+str(ls[-1])
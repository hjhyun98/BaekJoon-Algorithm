def solution(s):
    k = s.replace('{',',').replace('}',',')
    l = list(map(int,[v for v in k.split(",") if v]))
    s1 = list(set(l))
    s1.sort(key=lambda x : l.count(x), reverse=True)
    return s1
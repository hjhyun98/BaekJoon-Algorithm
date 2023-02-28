def f1(x):
    print(x)
    k = []
    for i in range(x[0], x[-1]+1):
        if x.count(i) == 2:
            k.append(i)
    print(k)
    if len(k) < 2:
        return 0
    else:
        return k[-1] - k[0]

def solution(lines):
    answer = 0
    a = [i for i in range(lines[0][0], lines[0][1]+1)]
    b = [i for i in range(lines[1][0], lines[1][1]+1)]
    c = [i for i in range(lines[2][0], lines[2][1]+1)]
    answer += f1(sorted(a+b))
    answer += f1(sorted(b+c))
    answer += f1(sorted(a+c))
    k = sorted(a+b+c)
    q = [i for i in range(k[0], k[-1]+1) if k.count(i) == 3]   
    if q:
        answer -= 2*(q[-1] - q[0])
    return answer
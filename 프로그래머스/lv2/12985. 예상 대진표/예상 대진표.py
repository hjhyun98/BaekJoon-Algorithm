def solution(n,a,b):
    answer = 1
    while abs(a-b) != 1 or a//2 == b//2:
        print(n, a, b)
        a = get_num(a)
        b = get_num(b)
        answer += 1
    return answer

def get_num(a):
    if a % 2 == 1:
        return (a+1) // 2
    else:
        return a//2
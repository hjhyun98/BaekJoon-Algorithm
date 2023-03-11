def solution(n):
    answer = 0
    start = 1
    while start <= n:
        add = 0
        for i in range(start, n+1):
            add += i
            if add == n:
                answer += 1
                break
            elif add > n:
                break
        start += 1         
    return answer
def solution(n):
    prime = [i for i in range(n+1)]
    answer = 0
    for i in range(2, n+1):
        for j in range(2, n):
            if i*j > n:
                break
            prime[i*j] = 0

    for i in range(2, n+1):
        if prime[i] != 0:
            answer += 1
    return answer
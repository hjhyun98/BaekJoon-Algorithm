def solution(citations):
    answer = 0
    citations.sort()
    n = len(citations)
    h_idx = n
    for i in range(n):
        h_idx = n-i
        if citations[i] >= h_idx:
            answer = h_idx
            break
    return answer
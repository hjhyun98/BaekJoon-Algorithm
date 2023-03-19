def solution(s):
    answer = []
    for i, ch in enumerate(list(s)):
        if s[:i+1].count(ch) == 1:
            answer.append(-1)
        else:
            idx = i-1
            while s[idx] != ch:
                idx -= 1
            answer.append(i-idx)
    return answer
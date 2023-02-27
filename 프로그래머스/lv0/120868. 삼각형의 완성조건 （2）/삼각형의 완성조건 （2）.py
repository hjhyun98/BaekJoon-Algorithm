def solution(sides):
    answer = 0
    l = max(sides)
    s = min(sides)
    return sum([1 for i in range((l-s)+1, l+1)])+sum([1 for i in range(l+1, l+s)])
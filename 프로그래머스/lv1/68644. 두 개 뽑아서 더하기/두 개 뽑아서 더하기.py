from itertools import combinations
def solution(numbers):
    k = list(combinations(numbers,2))
    answer = list(set([sum(i) for i in k]))
    return sorted(answer)
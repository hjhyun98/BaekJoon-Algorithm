from itertools import combinations
def solution(nums):
    answer = 0
    combi = list(combinations(nums, 3))
    for i in combi:
        if is_prime(sum(i)):
            answer += 1
    return answer

def is_prime(x):
    for i in range(2,x):
        if x % i == 0:
            return False
    return True
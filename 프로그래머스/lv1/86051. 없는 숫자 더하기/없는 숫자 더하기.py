def solution(numbers):
    s1 = set(numbers)
    s2 = set([0,1,2,3,4,5,6,7,8,9])
    return sum([i for i in list(s2 - s1)])
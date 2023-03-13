import math
def solution(n, words):
    flag = False
    for i in range(1, len(words)):
        if words[i][0] != words[i-1][-1]:
            return [n if (i+1)%n == 0 else (i+1)%n , math.ceil((i+1)/n)]
            break
        elif words[:i].count(words[i]) > 0:
            return [n if (i+1)%n == 0 else (i+1)%n , math.ceil((i+1)/n)]
            break
    return [0,0]
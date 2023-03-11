def solution(s):
    answer = True
    stack = 0
    for i in s:
        
        if i == '(':
            stack += 1
        else:
            if stack == 0:
                answer = False
            else:
                stack -= 1
    if stack > 0:
        answer = False
    return answer
def solution(s):
    l = list(s)
    answer = 0
    temp = ''
    for i in range(len(s)):
        if is_right(l):
            answer += 1 
        temp = l.pop()
        l.insert(0, temp)
    return answer

def is_right(s):
    stack = [s[0]]
    for i in range(1, len(s)):
        stack.append(s[i])
        last = "".join(stack[-2:])
        if last == "()" or last == "{}" or last == "[]":
            del stack[-2:]
    if len(stack) == 0:
        return True
    else:
        return False
    
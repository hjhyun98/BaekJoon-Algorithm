def solution(quiz):
    answer = []
    for i in quiz:
        l = i.split('=')
        answer.append("O") if eval(l[0]) == int(l[1]) else answer.append("X")
    return answer
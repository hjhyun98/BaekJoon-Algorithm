def solution(my_string):
    answer = ''
    for i in my_string:
        if my_string.count(i) == 1:
            answer += i
        elif my_string.count(i) > 1 and answer.count(i) == 0:
            answer += i
        else:
            continue
    return answer
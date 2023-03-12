def solution(n):
    one = format(n, 'b').count('1')
    answer = n+1
    while True:
        if format(answer, 'b').count('1') != one:
            answer += 1
        else:
            break
    return answer
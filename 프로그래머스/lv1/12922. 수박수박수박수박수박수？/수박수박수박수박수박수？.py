def solution(n):
    answer = ""
    str = ["수","박"]
    for i in range(1,n+1):
        if i % 2 != 0:
            answer += str[0]
        else:
            answer += str[1]
    return answer
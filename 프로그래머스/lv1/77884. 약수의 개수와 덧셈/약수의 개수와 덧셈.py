def get_divisor(num):
    cnt = 0
    for n in range(1, num+1):
        if num % n == 0:
            cnt += 1
    return cnt

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if get_divisor(i) % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer



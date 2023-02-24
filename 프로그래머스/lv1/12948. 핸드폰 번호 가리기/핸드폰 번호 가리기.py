def solution(phone_number):
    answer = ""
    n = phone_number[-4:]
    for i in range(len(phone_number)-4):
        answer += "*"
    return answer+n
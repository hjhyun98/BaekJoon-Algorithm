def solution(food):
    answer = ''
    for i in  range(len(food)-1):
        answer += str(i+1)*(food[i+1]//2)
    return answer+"0"+answer[::-1]
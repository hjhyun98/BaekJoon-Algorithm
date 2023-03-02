def solution(score):
    answer = [0 for i in score]
    avg = list(map(lambda x: sum(x)/2, score))
    print(avg)
    cnt = 1
    rank = 0
    temp = -1
    while cnt <= len(score):
        if temp != max(avg):
            rank=cnt
        answer[avg.index(max(avg))]=rank
        print(avg.index(max(avg)), max(avg), rank, answer)
        temp = max(avg)
        avg[avg.index(max(avg))] = -1
        cnt += 1
        
    return answer
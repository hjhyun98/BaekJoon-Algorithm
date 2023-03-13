def solution(brown, yellow):
    l = get_mul(brown+yellow)
    for i in l:
        if (i[0]-2)*(i[1]-2) == yellow:
            return [i[1], i[0]]
    
    
def get_mul(num):
    l = []
    for i in range(2, num+1):
        if i > num // i:
            break
        if num % i == 0:
            l.append([i,num//i])
    return l
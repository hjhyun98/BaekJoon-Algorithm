def solution(A,B):
    A.sort()
    B.sort(reverse=True)
    print(A, B)
    return sum([i*j for i,j in zip(A,B)])

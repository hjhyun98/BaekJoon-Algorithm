def solution(arr1, arr2):
    m = len(arr1)
    n = len(arr1[0])
    r = len(arr2[0])
    answer = []
    for i in range(m):
        temp =[]
        for j in range(r):
            s = 0   
            for k in range(n):
                s += arr1[i][k]*arr2[k][j]
            temp.append(s)
        answer.append(temp) 
    return answer
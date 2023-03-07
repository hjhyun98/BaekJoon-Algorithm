def solution(arr1, arr2):
    answer = []
    for i,j in zip(arr1, arr2):
        temp = []
        for n, m in zip(i, j):
            temp.append(n+m)
        answer.append(temp)
    return answer
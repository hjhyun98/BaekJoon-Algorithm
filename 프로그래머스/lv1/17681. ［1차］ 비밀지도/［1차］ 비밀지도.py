def solution(n, arr1, arr2):
    answer = ['' for i in range(n)]
    for i in range(n):
        s1 = format(arr1[i],'b').zfill(n)
        s2 = format(arr2[i],'b').zfill(n)
        for j in range(n):
            if s1[j] == '1' or s2[j] == '1':
                answer[i] += '#'
            else:
                answer[i] += ' '
    return answer
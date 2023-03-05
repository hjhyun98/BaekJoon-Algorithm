def solution(A, B):
    if A == B:
        return 0
    else:
        cnt = 0
        list_a = list(A)
        list_b = list(B)
        while list_a != list_b:
            c = list_a.pop()
            list_a.insert(0, c)
            cnt +=1
            if cnt > 100:
                return -1
        return cnt
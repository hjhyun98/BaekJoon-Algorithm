def solution(num, k):
    n_list = list(map(int, str(num)))
    if k in n_list:
        return n_list.index(k)+1
    else:
        return -1
    
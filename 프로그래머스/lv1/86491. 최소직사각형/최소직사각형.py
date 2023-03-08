def solution(sizes):
    for i in sizes:
        if i[1] > i[0]:
            i[1], i[0] = i[0], i[1]
    return  max([i[0] for i in sizes])*max([i[1] for i in sizes])
        
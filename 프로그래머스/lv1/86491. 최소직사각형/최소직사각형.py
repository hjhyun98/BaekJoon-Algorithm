def solution(sizes):
    for i in sizes:
        if i[1] > i[0]:
            i[1], i[0] = i[0], i[1]
    maxW = max([i[0] for i in sizes])
    maxH = max([i[1] for i in sizes])
    print(maxW, maxH)
    return maxW*maxH
        
def solution(before, after):
    for i in after:
        # if i not in before:
        #     return 0
        if before.count(i) != after.count(i):
            return 0
    return 1
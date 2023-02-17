def solution(sides):
    longer = max(sides)
    if sum(sides) - longer > longer:
        return 1
    else:
        return 2
def solution(cards1, cards2, goal):
    idx1 = 0
    idx2 = 0
    for i in goal:
        if i in cards1:
            temp = cards1.index(i)
            if temp != idx1:
                return "No"
            else:
                idx1 = temp+1
        elif i in cards2:
            temp = cards2.index(i)
            if temp != idx2:
                return "No"
            else:
                idx2 = temp+1
        else:
            return "No"
    return "Yes"
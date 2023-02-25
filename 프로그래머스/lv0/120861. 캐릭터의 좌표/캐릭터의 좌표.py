def solution(keyinput, board):
    result = [0,0]
    for i in keyinput:
        if i == "left":
            if result[0] <= -(board[0]//2):
                continue
            else:
                result[0] -= 1
        elif i == "right":
            if result[0] >= board[0]//2:
                continue
            else:
                result[0] += 1
        elif i == "up":
            if result[1] >= board[1] // 2:
                continue
            else:
                result[1] += 1
        else:
            if result[1] <= -(board[1] // 2) :
                continue
            else:
                result[1] -= 1
    return result
                
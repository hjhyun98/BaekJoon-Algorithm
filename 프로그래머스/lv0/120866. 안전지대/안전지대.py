def solution(board):
    answer = 0
    d = [[-1, -1], [0,-1], [1,-1], [-1, 0], [1,0], [-1, 1], [0,1], [1,1]]
    n = len(board)
    for i in range(0,n):
        for j in range(0, n):
            if board[i][j] == 1:
                for k in d:
                    new_x = i+k[0]
                    new_y = j+k[1]
                    if new_x >= 0 and new_x < n and new_y >= 0 and new_y < n and board[new_x][new_y] != 1:
                        board[new_x][new_y] = 2
    for i in board:
        for j in i:
            if j == 0 :
                answer += 1
    return answer
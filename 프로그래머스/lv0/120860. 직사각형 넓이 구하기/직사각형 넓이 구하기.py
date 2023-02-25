def solution(dots):
    width = max([i[0] for i in dots]) - min([i[0] for i in dots])
    height = max([i[1] for i in dots]) - min([i[1] for i in dots])
    return width*height
    
def solution(numbers):
    max_abs = 0
    for i in range(0, len(numbers)):
        if abs(max_abs) < abs(numbers[i]):
            max_abs = numbers[i]
            
    if max_abs < 0:
        if len([i for i in numbers if i < 0 ]) != 1:
            numbers.remove(max_abs)
            return max_abs * min([i for i in numbers if i < 0 ])
        else:
            max_abs = max(numbers)
            numbers.remove(max_abs)
            return max_abs*max(numbers)
    else:
        numbers.remove(max_abs)
        return max_abs*max(numbers)
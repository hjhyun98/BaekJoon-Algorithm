def solution(numbers):
    answer = 0
    n = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    s = ""
    for i in numbers:
        s += i
        for j in range(10):
            if s == n[j]:
                answer = answer * 10 + j
                s = ""
    return answer
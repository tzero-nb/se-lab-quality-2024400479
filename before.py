# before.py

def process_math_scores():
    # 坏味道 1: 未使用的局部变量 (Unused local variable)
    # 扫描工具会提示该变量被声明或赋值，但从未使用过
    unused_temp_var = 100 

    # 坏味道 2: 重复代码 (Duplicated blocks of code)
    scores = [85, 90, 78, 92, 88]
    total = 0
    for score in scores:
        total += score
    average = total / len(scores)
    print("Math Average:", average)

    highest = scores[0]
    for score in scores:
        if score > highest:
            highest = score
    print("Math Highest:", highest)

def process_english_scores():
    # 坏味道 2: 重复代码 (与 process_math_scores 中的逻辑完全一致，仅数据不同)
    scores = [88, 76, 95, 80, 85]
    total = 0
    for score in scores:
        total += score
    average = total / len(scores)
    print("English Average:", average)

    highest = scores[0]
    for score in scores:
        if score > highest:
            highest = score
    print("English Highest:", highest)

if __name__ == "__main__":
    process_math_scores()
    process_english_scores()
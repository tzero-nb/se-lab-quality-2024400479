# after.py

def calculate_and_print_stats(subject_name, scores):
    """
    重构：提取公共方法，消除重复的计算逻辑
    """
    if not scores:
        return

    # 使用内置函数简化代码
    average = sum(scores) / len(scores)
    print(f"{subject_name} Average: {average}")

    highest = max(scores)
    print(f"{subject_name} Highest: {highest}")

def main():
    # 统一管理数据并调用重构后的通用函数
    math_scores = [85, 90, 78, 92, 88]
    english_scores = [88, 76, 95, 80, 85]

    calculate_and_print_stats("Math", math_scores)
    calculate_and_print_stats("English", english_scores)

if __name__ == "__main__":
    main()
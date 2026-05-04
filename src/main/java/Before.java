// Before.java - 包含坏味道的代码

import java.util.Scanner;

public class Before {
    
    // 重复代码：两个几乎一样的功能
    public static void showGreetingEnglish() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void showGreetingFrench() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Bonjour, " + name + "!");
    }

    // 过长函数：做了太多事情
    public static void bigFunction() {
        System.out.println("Start");
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        System.out.println("Step 4");
        System.out.println("Step 5");
        System.out.println("Processing...");
        int a = 1 + 2;
        int b = a * 3;
        int c = b / 2;
        System.out.println("Result: " + c);
        System.out.println("End");
        System.out.println("Clean up");
    }

    public static void main(String[] args) {
        showGreetingEnglish();
        bigFunction();
    }
}

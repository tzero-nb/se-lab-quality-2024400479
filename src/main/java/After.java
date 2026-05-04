// After.java - 重构后的代码

import java.util.Scanner;

public class After {

    // 用1个函数代替2个重复函数
    public static void showGreeting(String language) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        
        if (language.equals("english")) {
            System.out.println("Hello, " + name + "!");
        } else if (language.equals("french")) {
            System.out.println("Bonjour, " + name + "!");
        }
    }

    // 把过长函数拆分成多个小函数
    private static void printSteps() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i);
        }
    }

    private static void process() {
        System.out.println("Processing...");
        int a = 1 + 2;
        int b = a * 3;
        int c = b / 2;
        System.out.println("Result: " + c);
    }

    private static void cleanUp() {
        System.out.println("Clean up");
    }

    public static void betterFunction() {
        System.out.println("Start");
        printSteps();
        process();
        System.out.println("End");
        cleanUp();
    }

    public static void main(String[] args) {
        showGreeting("english");
        betterFunction();
    }
}

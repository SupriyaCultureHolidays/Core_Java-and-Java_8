// User Input + Try-With-Resources practice
// Scanner AutoCloseable, তাই try (...) ব্লকের ভিতরে রাখলে block শেষে নিজে থেকেই close হয়ে যায়
public class ConsoleMenu {

    public static void run() {
        // try (Scanner sc = new Scanner(System.in)) {
        //     boolean running = true;
        //     while (running) {
        //         System.out.println("1. Deposit");
        //         System.out.println("2. Withdraw");
        //         System.out.println("3. Transfer");
        //         System.out.println("4. Exit");
        //         int choice = Integer.parseInt(sc.nextLine());
        //         switch (choice) {
        //             case 1 -> { /* BankService.getInstance().deposit(...) — try/catch দিয়ে exception handle করো */ }
        //             case 2 -> { /* withdraw(...) */ }
        //             case 3 -> { /* transfer(...) */ }
        //             case 4 -> running = false;
        //             default -> System.out.println("Invalid choice");
        //         }
        //     }
        // }
        // — try ব্লক শেষ হলে Scanner নিজে থেকেই close হবে, finally লেখার দরকার নেই
    }
}

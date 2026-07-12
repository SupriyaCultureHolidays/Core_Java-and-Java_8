// User Input (topic 34) + Try-With-Resources (topic 35) practice
// Scanner AutoCloseable, তাই try (...) ব্লকের ভিতরে রাখলে block শেষে নিজে থেকেই close হয়ে যায়
public class ConsoleMenu {

    public static void run() {
        // try (Scanner sc = new Scanner(System.in)) {
        //     boolean running = true;
        //     while (running) {
        //         System.out.println("1. Book Appointment");
        //         System.out.println("2. Cancel Appointment");
        //         System.out.println("3. Search Appointments");
        //         System.out.println("4. Exit");
        //         int choice = Integer.parseInt(sc.nextLine());
        //         switch (choice) {
        //             case 1 -> { /* HospitalService.getInstance().bookAppointment(...) — try/catch দিয়ে exception handle করো */ }
        //             case 2 -> { /* cancelAppointment(...) */ }
        //             case 3 -> { /* searchAppointments(...) */ }
        //             case 4 -> running = false;
        //             default -> System.out.println("Invalid choice");
        //         }
        //     }
        // }
        // — try ব্লক শেষ হলে Scanner নিজে থেকেই close হবে, finally লেখার দরকার নেই
    }
}

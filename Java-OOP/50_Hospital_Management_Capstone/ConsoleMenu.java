// User Input (topic 18) + Try-With-Resources (topic 19) practice
// Scanner AutoCloseable, তাই try (...) ব্লকের ভিতরে রাখলে block শেষে নিজে থেকেই close হয়ে যায়
//
// NOTE: এই run() console থেকে input নেয় বলে Demo.main()-এর ভিতর থেকে call করা হয়নি
// (automated run block হয়ে যাবে) — নিজে আলাদাভাবে চালিয়ে test করো: ConsoleMenu.run();

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleMenu {

    public static void run() {
        try (Scanner sc = new Scanner(System.in)) {
            HospitalService service = HospitalService.getInstance();
            boolean running = true;
            while (running) {
                System.out.println("1. Book Appointment");
                System.out.println("2. Cancel Appointment");
                System.out.println("3. Search Appointments (BOOKED)");
                System.out.println("4. Exit");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> {
                        System.out.print("Appointment ID: ");
                        String id = sc.nextLine();
                        System.out.print("Patient ID: ");
                        String patientId = sc.nextLine();
                        System.out.print("Doctor ID: ");
                        String doctorId = sc.nextLine();
                        System.out.print("Date (yyyy-mm-dd): ");
                        LocalDate date = LocalDate.parse(sc.nextLine());
                        try {
                            System.out.println(service.bookAppointment(id, patientId, doctorId, date));
                        } catch (SlotAlreadyBookedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        System.out.print("Appointment ID: ");
                        String id = sc.nextLine();
                        try {
                            service.cancelAppointment(id);
                        } catch (AppointmentNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 3 -> System.out.println(
                            service.searchAppointments(a -> a.getStatus() == AppointmentStatus.BOOKED));
                    case 4 -> running = false;
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        // — try ব্লক শেষ হলে Scanner নিজে থেকেই close হবে, finally লেখার দরকার নেই
    }
}

// Java Record — Immutable data class, কোন account-এ কবে কী ধরনের transaction হলো তার log রাখার জন্য
// Record ব্যবহার করলে equals(), hashCode(), toString(), getter — সব automatically চলে আসে
//
// public record TransactionRecord(String accountNumber, TransactionType type, double amount, java.time.LocalDate date) {}
// — উপরের এক লাইনই পুরো record definition, আলাদা constructor/getter লেখার দরকার নেই

public record TransactionRecord(String accountNumber, TransactionType type, double amount, java.time.LocalDate date) {
}
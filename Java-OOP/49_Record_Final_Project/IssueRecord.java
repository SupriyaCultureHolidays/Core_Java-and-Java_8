// Java Record — Immutable data class, কে কোন বই কবে issue করলো তার log রাখার জন্য
// Record ব্যবহার করলে equals(), hashCode(), toString(), getter — সব automatically চলে আসে
public record IssueRecord(String bookId, String studentId, java.time.LocalDate issueDate) {
}

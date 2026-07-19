// Java Record — Immutable data class, কোন student কোন course কবে শেষ করলো আর কী grade পেলো
// তার log রাখার জন্য। Record ব্যবহার করলে equals(), hashCode(), toString(), getter — সব
// automatically চলে আসে।
//
// public record CourseCompletionRecord(String studentId, String courseId, java.time.LocalDate completionDate, String grade) {}
// — উপরের এক লাইনই পুরো record definition, আলাদা constructor/getter লেখার দরকার নেই

public record CourseCompletionRecord(String studentId, String courseId, java.time.LocalDate completionDate, String grade) {
}


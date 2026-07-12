// Java Record — Immutable data class, কোন doctor কোন patient-কে কবে prescription দিলো তার log রাখার জন্য
// Record ব্যবহার করলে equals(), hashCode(), toString(), getter — সব automatically চলে আসে
public record Prescription(String patientId, String doctorId, java.time.LocalDate date, String medicine) {
}

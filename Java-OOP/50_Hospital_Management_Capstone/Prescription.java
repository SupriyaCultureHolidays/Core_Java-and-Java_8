// Java Record — Immutable data class, কোন doctor কোন patient-কে কবে prescription দিলো তার log রাখার জন্য
// Record ব্যবহার করলে equals(), hashCode(), toString(), getter — সব automatically চলে আসে
//
// public record Prescription(String patientId, String doctorId, LocalDate date, String medicine) {}
// — উপরের এক লাইনই পুরো record definition, আলাদা constructor/getter লেখার দরকার নেই

import java.time.LocalDate;

public record Prescription(String patientId, String doctorId, LocalDate date, String medicine) {}
// Annotation (topic 28) — নিজের custom annotation বানানো
// RUNTIME-এ retain না করলে reflection দিয়ে পরে পড়া যাবে না, তাই @Retention(RUNTIME) দরকার
// এটা @Component/@Autowired-এর মতো Spring annotation বোঝার আগে ভালো foundation দেবে
//
// @Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
// public @interface AuditLog {
//     String action();
// }

// Annotation — নিজের custom annotation বানানো
// RUNTIME-এ retain না করলে reflection দিয়ে পরে পড়া যাবে না, তাই @Retention(RUNTIME) দরকার
// এটা Spring-এর @Transactional/@Loggable-এর মতো annotation বোঝার আগে ভালো foundation দেবে
//
// @Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
// public @interface Loggable {
//     String action();
// }

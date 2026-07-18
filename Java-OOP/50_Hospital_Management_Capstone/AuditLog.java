// Annotation (topic 15) — নিজের custom annotation বানানো হলো
// RUNTIME-এ retain না করলে reflection দিয়ে পরে পড়া যাবে না, তাই @Retention(RUNTIME) দরকার
// এটা @Component/@Autowired-এর মতো Spring annotation বোঝার আগে ভালো foundation দেবে

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuditLog {
    String action();
}

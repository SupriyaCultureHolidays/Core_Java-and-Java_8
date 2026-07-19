// প্লেইন ডেটা হোল্ডার — Course-এর id, name, capacity (কতজন student একসাথে ENROLLED থাকতে
// পারবে), আর instructorId রাখার জন্য
public class Course {

    // id (String), name (String), capacity (int), instructorId (String) রাখো
    // constructor লিখো
    String id;
    String name;
    int capacity;
    String instructorId;

    Course(String id, String name, int capacity, String instructorId) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.instructorId = instructorId;
    }

    @Override
    public String toString() {
        return "Course{id='" + id + "', name='" + name +
                "', capacity=" + capacity +
                ", instructorId='" + instructorId + "'}";
    }
}

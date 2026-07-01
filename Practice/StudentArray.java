public class StudentArray {
    String name;
    int roll;
}

class Demo {
    public static void main(String[] args) {
        StudentArray[] students = new StudentArray[3];

        students[0] = new StudentArray();
        students[0].name = "Supriya";
        students[0].roll = 146;

        students[1] = new StudentArray();
        students[1].name = "Roni";

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    "Name: " + students[i].name +
                            ", Roll: " + students[i].roll);

        }

        String a = null;
        System.out.println(a.length());
    }
}
public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer(
                "L100",
                "Ahmed",
                "Java Programming",
                "Faculty of Information Technology"
        );

        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}
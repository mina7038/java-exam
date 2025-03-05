public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Mina", 90);
        Student s2 = new Student("John", 80);
        int avg = (s1.score + s2.score) / 2;
        System.out.println("평균 점수: " + avg);
    }
}
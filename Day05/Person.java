class Person {
    String name;
    int age;
    Person(String n, int a) {
        name = n; age = a;
    }
    void introduce() {
        System.out.println("안녕하세요, " + name + "이고 나이는 " + age + "살입니다.");
    }
}
class Car {
    String model;
    int year;
    Car(String m, int y) {
        model = m; year = y;
    }
    void info() {
        System.out.println(year + "년식 " + model);
    }
}

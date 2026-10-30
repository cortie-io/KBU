void main() {
    int age = 25;
    int license = 2;        // 운전면허 취득 후 경과 연수
    boolean drunk = false;  // 음주운전 전력

    boolean canRentCar = age >= 21 && license >= 1 && !drunk;
    System.out.println(canRentCar);
}

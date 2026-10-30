void main() {
    int age = 30;           // 나이(세)
    int salary = 6000;      // 연봉(만 원)
    boolean debt = true;    // 빚이 있으면 true

    boolean canTakeLoan = age >= 25 && age < 40 && salary >= 5000 && debt;
    System.out.println(canTakeLoan);
}

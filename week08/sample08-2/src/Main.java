void main() {
    // 나이(age)가 25세 이상이고 40세 미만이면서, 연봉(salary)이 5,000만원 이상이고,
    // 빚(debt)이 있는 사람인 경우 true가 되는 JAVA 수식은?

    int age = 30;
    int salary = 6000;      // 단위: 만원
    boolean debt = true;

    boolean canTakeLoan = age >= 25 && age < 40
            && salary >= 5000
            && debt;

    System.out.println(canTakeLoan);
}

// Report 0 : 사칙 연산자가 적용된 수식의 연산 과정과 결과
// 피연산자의 타입이 다르면 더 큰 타입으로 자동 형변환(승격)된 뒤 연산된다.
// char → int → long → float → double
void main() {
    System.out.println("수식         연산과정       결과                 타입");
    System.out.println("-------------------------------------------------------");
    System.out.printf("%-12s %-14s %-20s %s\n", "'A' / 3",  "65 / 3",      'A' / 3,  "int");
    System.out.printf("%-12s %-14s %-20s %s\n", "'A' / 3L", "65L / 3L",    'A' / 3L, "long");
    System.out.printf("%-12s %-14s %-20s %s\n", "1 + 3L",   "1L + 3L",     1 + 3L,   "long");
    System.out.printf("%-12s %-14s %-20s %s\n", "1.0 / 3",  "1.0 / 3.0",   1.0 / 3,  "double");
    System.out.printf("%-12s %-14s %-20s %s\n", "1 / 3.0",  "1.0 / 3.0",   1 / 3.0,  "double");
    System.out.printf("%-12s %-14s %-20s %s\n", "1.0F / 3", "1.0F / 3.0F", 1.0F / 3, "float");
}

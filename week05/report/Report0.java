public class Report0 {
    public static void main(String[] args) {
        int i = 10, j = 5, age = 15, b = 20, c2 = 10, year = 2024;
        char c = 'k', ch = 'Q';
        boolean powerOn = false;
        String str = "yes";

        System.out.println("1. " + (i % j == 0));
        System.out.println("2. " + (age <= 12));
        System.out.println("3. " + (age < b && age > c2));
        System.out.println("4. " + (age - 5 == 10));
        System.out.println("5. " + (age != b || age == c2));
        System.out.println("6. " + (c >= 'a' && c <= 'z'));
        System.out.println("7. " + ((ch >= 'A' && ch <= 'Z')
                || (ch >= 'a' && ch <= 'z')));
        System.out.println("8. " + (year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0)));
        System.out.println("9. " + (!powerOn));
        System.out.println("10. " + str.equals("yes"));
    }
}

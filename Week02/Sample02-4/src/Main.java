import java.sql.SQLOutput;

void main(){
    Scanner Keyboard = new Scanner(System.in);
    String name;
    int age;
    float height;
    double weight;

    System.out.print("당신의 이름은? ");
    name = Keyboard.nextLine();
    System.out.printf("%s님의 나이는? ",name);
    age = Keyboard.nextInt();
    System.out.printf("%s님의 키는? ",name);
    height = Keyboard.nextFloat();
    System.out.printf("%s님의 몸무게는? ",name);
    weight = Keyboard.nextDouble();

    System.out.println();
    System.out.printf("%s님의 나이는 %d살 입니다.\n",name,age);
    System.out.printf("%s님의 키는 %.1f CM 입니다.\n",name,height);
    System.out.printf("%s님의 몸무게는 %.1f KG 입니다.\n",name,weight);
}
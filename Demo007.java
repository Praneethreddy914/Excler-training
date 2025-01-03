import java.util.Scanner;
public class Demo007{
    public static void main(String[] args){
        String name;
        int age;
        String phono;
        System.out.printlm("plz enter ur name, age, and phone no");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        phono = sc.nextInt();
        System.out.println("hello "+name +"ur age is "+ age+ "ur phone no is"+ phono);
    }
    
}

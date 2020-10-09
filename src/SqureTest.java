import java.util.Scanner;

public class SqureTest {
    public static void main(String[] args) {
        Square s1 = new Square();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer as length of square : ");
        s1.length = input.nextInt();

        System.out.println("정사각형의 넓이 : " + s1.area());


    }

    static class Square {
        int length;


        int area(){
            return length * length;


        }

    }
}

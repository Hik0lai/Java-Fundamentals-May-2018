import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sideA = Integer.parseInt(scanner.next("\\w+"));
        Integer sideB = Integer.parseInt(scanner.next("\\w+"));

        Float area = (float)sideA*sideB;
        System.out.printf("%.2f",area);
    }
}

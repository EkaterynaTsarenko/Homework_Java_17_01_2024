import java.util.Scanner;

public class Main {
    public static void main(String...args) {

        Scanner scanner = new Scanner(System.in);

        Celsious celsious = new Celsious();

        System.out.println("Назовите ваше имя : ");
        celsious.name = scanner.nextLine();
        System.out.println("Ваше имя:" + celsious.name.toUpperCase());

        System.out.println("Назовите число в градусах по Цельсию: ");
        celsious.CelsiousDegree = scanner.nextInt();
        System.out.println("Ваше число по цельсию равняется: " + celsious.CelsiousDegree);
        System.out.println();
        celsious.Farenheitresult();















    }
}
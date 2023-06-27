import java.util.Scanner;

public class Main { public static void main(String[] args) { Scanner input = new Scanner(System.in);

    System.out.println("Введите длины трех отрезков:");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("Из данных отрезков можно составить треугольник");
        double cosineC = (a * a + b * b - c * c) / (2 * a * b);
        double cosineB = (a * a + c * c - b * b) / (2 * a * c);
        double cosineA = (b * b + c * c - a * a) / (2 * b * c);

        double angleA = Math.toDegrees(Math.acos(cosineA));
        double angleB = Math.toDegrees(Math.acos(cosineB));
        double angleC = Math.toDegrees(Math.acos(cosineC));

        if (angleA > angleB && angleA > angleC) {
            System.out.println("Наибольший внешний угол треугольника равен " + angleA);
        } else if (angleB > angleC) {
            System.out.println("Наибольший внешний угол треугольника равен " + angleB);
        } else {
            System.out.println("Наибольший внешний угол треугольника равен " + angleC);
        }
    } else {
        System.out.println("Из данных отрезков нельзя составить треугольник");
    }
}
}
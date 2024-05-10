import java.util.Scanner;

public class JavaTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        step1();

        System.out.print("Введите число от 1 до 12");
        int month = sc.nextInt();
        step2(month);

        System.out.print("Введите а: ");
        double a = sc.nextDouble();
        System.out.print("Введите b: ");
        double b = sc.nextDouble();
        System.out.print("Введите c: ");
        double c = sc.nextDouble();
        step3(a, b, c);
        
    }


    static void step1() {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                System.out.print(i * N - (N - j) + " ");

            }
            System.out.println();
        }
    }
    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            default:
                System.out.println("Нет такого месяца");
        }
    }
    static void step3(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: " + root1 + " и " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Единственный корень уравнения: " + root);
        }
        else {
            System.out.println("Корней нет");
        }



    }





    }


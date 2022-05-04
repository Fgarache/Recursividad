import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        Main main = new Main();
        try {
            main.bajar(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //metodo recursivo
    public void bajar(int escalones) throws InterruptedException {

        if (escalones == 0) {
            System.out.printf("fin");
        }else {
            Thread.sleep(500);
            System.out.println("bajando" +escalones );
            bajar(escalones-1);

        }

    }

}
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter statement:");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String[] cases = {"+", "-", "/", "*"};

        int i;

        for (i = 0; i < cases.length; i++) {
            if (input.contains(cases[i]))
                break;
        }

        switch (i) {

            case 0: {
                String[] inputs = input.split("\\+");

                for (int j = 0; j < inputs.length; j++) {
                    inputs[j] = inputs[j].trim();
                }

                int first = Integer.parseInt(inputs[0]);
                int second = Integer.parseInt(inputs[1]);

                System.out.println(first + second);
                break;
            }

            case 1: {
                String[] inputs = input.split("-");

                for (int j = 0; j < inputs.length; j++) {
                    inputs[j] = inputs[j].trim();
                }
                int first = Integer.parseInt(inputs[0]);
                int second = Integer.parseInt(inputs[1]);

                System.out.println(first - second);
                break;
            }

            case 2: {
                String[] inputs = input.split("/");

                for (int j = 0; j < inputs.length; j++) {
                    inputs[j] = inputs[j].trim();
                }
                int first = Integer.parseInt(inputs[0]);
                int second = Integer.parseInt(inputs[1]);

                System.out.println(first / second);
                break;
            }

            case 3: {
                String[] inputs = input.split("\\*");

                for (int j = 0; j < inputs.length; j++) {
                    inputs[j] = inputs[j].trim();
                }
                int first = Integer.parseInt(inputs[0]);
                int second = Integer.parseInt(inputs[1]);

                System.out.println(first * second);
                break;
            }

        }
    }


}
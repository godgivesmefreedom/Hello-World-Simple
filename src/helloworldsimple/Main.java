package helloworldsimple;

public class Main {

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("ERROR: This application doesn't take any arguments!");
            return;
        }

        System.out.println("Hello World!");
        return;
    }
}

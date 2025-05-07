/**
 * Class HelloWorld
 */
public class HelloWorld {

    private static final String HELLO_WORLD = "Hello, world!";

    public static void main(String[] args) {
        System.out.println(HELLO_WORLD);
    }

    public static void greet(final String name) {
        System.out.println("Hello " + name);
    }
}

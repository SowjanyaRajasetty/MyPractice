

public class Runnerrr {
    public static void main(String[] args) {
        String name = "Java Test";
        Runnable runnable = () -> System.out.println(name);
        runnable.run();
    }
}



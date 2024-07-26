package ForLoop;

public class MultipleInitialization {
    public static void main(String[] args) {
        for ( int i = 0, j = 10; i < 5 && j > 0; i++, j-- )
            System.out.println("i: " + i + ", j: " + j);
    }
}

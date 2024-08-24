package WhileLoop_SentinelLoop;

public class Counter_ControlVariable {
    public static void main(String[] args) {
        // Caz in care contorul este si variabila de control
        int i = 0;
        while (i < 5)  // "i" este atat contor cat si variabila de control
        {
            System.out.println("Valoarea lui i este: " + i);
            i++;          
        }

        System.out.println("=======================");
        
        // Caz in care contorul si variabila de control sunt diferite
        int counter = 0;
        boolean continueLoop = true;

        while (continueLoop) // continueLoop este variabila de control
        {
            System.out.println("Counter: " + counter);
            counter++; // counter este contorul

            if (counter >= 5) 
            {
                continueLoop = false;
            }
        }
    }

}

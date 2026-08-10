import java.io.*;

class Product{
    
    // Multiplying two integer values
    public int multiply(int a, int b){
        
        int prod = a * b;
        return prod;
    }

    // Multiplying three integer values
    public int multiply(int a, int b, int c){
        
        int prod = a * b * c;
        return prod;
    }
}

class Geeks{
    
    public static void main(String[] args)
    {
        
        Product ob = new Product();

        // Calling method to Multiply 2 numbers
        int prod1 = ob.multiply(1, 2);

        // Printing Product of 2 numbers
        System.out.println(
            "Product of the two integer value: " + prod1);

        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);

        // Printing product of 3 numbers
        System.out.println(
            "Product of the three integer value: " + prod2);
    }
}

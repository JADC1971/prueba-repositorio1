public class Main {

    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 5;

        // Primer comentario de linea
        /* Comentario de bloque
        System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");    */
        /** Comentario Javadoc comment */
        System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");
        // Prefix and Postfix Operator
        System.out.println(++valor1); //Hace la operacion y asigna valor 6
        System.out.println(valor1);   //Mismo valor 6 Prefix
        System.out.println(valor2++); //Imprime el valor 5 y luego le suma a la variable
        System.out.println(valor2); //Muestra el valor 6 Postfix.

        //Compound Assignment Operators
        int total = 100;
        valor1 = 10;
        valor2 = 5;
        total /= valor1 * valor2;
        System.out.println(total); // Total 100 / (10*5) = 2
    }
}

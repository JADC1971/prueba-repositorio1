package Ejemplo1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Ejercicio1();
        // Ejercicio3();
        // Ejercicio4();
        // Ejercicio5();
        // Ejercicio6();
        // Ejercicio7();
        // Ejercicio8();
        // Ejercicio9();
        // Ejercicio10();
        // Ejercicio11();
        // Ejercicio12();
        // Ejercicio13();
        // Ejercicio14();
        // Ejercicio15();
        // Ejercicio16();
        // Ejercicio17();
        pruebaGit();


    }

    private static void pruebaGit() {
        Operacion op = new Operacion(6, 2);
        System.out.println("La suma es: " + op.suma());
        System.out.println("La resta es: " + op.resta());
        System.out.println("La division es: " + op.divide());
        System.out.println("La multiplicación es: " + op.multiplica());
    }

    private static void Ejercicio17() {
    }

    private static void Ejercicio16() {
        int limite, cuantos;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Introduce el limite del random > 0: ");
            limite = scan.nextInt();
        } while (limite <= 0);
        do {
            System.out.println("Introduce número de aleatorios a calcular > 0: ");
            cuantos = scan.nextInt();
        } while (cuantos <= 0);
        for (int i= 1; i<= cuantos; i++) {
            System.out.print(" " + (int) (Math.random() * limite + 1));
        }
    }

    private static void Ejercicio15() {
        int num, resul = 1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Numero positivo para calcular factorial: ");
            num = scan.nextInt();
        } while (num < 0);
        if (num == 0) {
            System.out.println("El factorial del numero 0 = 1");
        }
        else {
            for (int i = 1; i<= num; i++){
                if (i > 1) {
                    System.out.print(" x ");
                }
                resul *= i;
                System.out.print(i);
            }
            System.out.print(" = " + resul);
            System.out.println("\nEl factorial del numero " + num + " = " + resul);
        }
 }

    private static void Ejercicio14() {
        int num = -1, soliNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero a divinar: ");
        soliNum = scan.nextInt();
        do {
            System.out.println("Introduzca Numero: ");
            num =  scan.nextInt();
            if (soliNum > num) {
                System.out.println("El número introducido es menor que el que hay que adivinar");
            } else if (soliNum < num){
                System.out.println("El número introducido es mayor que el que hay que adivinar");
            }
        }    while (soliNum != num);

    }

    private static void Ejercicio13() {
        int num;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Numero entre (0-10): ");
            num = scan.nextInt();
        } while (num < 0 || num > 10);
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    private static void Ejercicio12() {
        int num1, num2, par = 0, impar = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Numero1:");
        num1 = scan.nextInt();

        System.out.print("Numero2:");
        num2 = scan.nextInt();
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if ( i % 2 == 0){
                    par += i;
                } else {
                    impar += i;
                }
                System.out.print(" " + i);
            }
        }
        else {
            for (int i = num1; i <=num2; i++){
                if ( i % 2 == 0){
                    par += i;
                } else {
                    impar += i;
                }
                System.out.print(" " + i);}
        }
        System.out.println( "\nSuma de los números pares: " + par);
        System.out.println("Suma de los números impares: " + impar);
    }


    private static void Ejercicio11() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Numero1:");
        num1 = scan.nextInt();

        System.out.print("Numero2:");
        num2 = scan.nextInt();
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.print(" " + i);
            }
        }
        else {
            for (int i = num1; i <=num2; i++){
                System.out.print(" " + i);}
            }
    }

    private static void Ejercicio10() {
        Scanner scan=  new Scanner(System.in);
        int num;
        System.out.print("Numero: ");
        num = scan.nextInt();
        for (int i= 1; i<=num; i++){
            System.out.print(" " + i);
        }

    }

    private static void Ejercicio9() {
        Scanner scan9  = new Scanner(System.in);
        int num9, resul9 = 0, cuantos = 0;
        System.out.print("Numero ejercicio 9: ");
        num9 = scan9.nextInt();
        while (num9 != 0){
            resul9 += num9;
            ++cuantos;
            System.out.print("Numero ejercicio 9: ");
            num9 = scan9.nextInt();
        }
        System.out.println("La suma es: " + resul9);
        System.out.println("Numero de números: " + cuantos);
        System.out.print("La media es: " + resul9/cuantos);
    }

    private static void Ejercicio8() {
        Scanner scan8 = new Scanner(System.in);
        int num8 = 1;
        System.out.print("Numero: ");
        num8 = scan8.nextInt();
        while (num8 >= 0){
            num8 *= num8;
            System.out.println("Su numero cuadrado es: " + num8);
            System.out.print("Numero: ");
            num8 = scan8.nextInt();
        }
    }

    private static void Ejercicio7() {
        int x  = 5;
        System.out.println(x>2?x<4?10:8:7); //Solución 8
    }
    private static void Ejercicio6() {
        Scanner scan6 = new Scanner(System.in);
        System.out.print("Introduce número mayor de 100");
        int num6, opc6;
        num6 = scan6.nextInt();
        if (num6 > 100 && num6 %2 != 0) {
            System.out.println("1 - Lo multiplica por 4");
            System.out.println("2 - Lo multiplica por 6");
            System.out.println("3 - Lo divide por 5");
            System.out.println("4 - Lo divide por 7");
            System.out.print("Elije opcion: ");
            opc6 = scan6.nextInt();
            switch (opc6) {
                case 1:
                    System.out.println(num6 * 4);
                    break;
                case 2:
                    System.out.println(num6 * 6);
                    break;
                case 3:
                    System.out.println(num6 / 5);
                    break;
                case 4:
                    System.out.println(num6 / 7);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        else {
            System.out.println("Numero es erroneo");
        }
    }

    private static void Ejercicio5() {
        Scanner scan5 = new Scanner(System.in);
        int mes;
        System.out.print("Numero de mes: ");
        mes = scan5.nextInt();
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Mes: " + mes + " tiene 31 días");
                break;
            case 4, 6, 9, 11:
                System.out.println("Mes: " + mes + " tiene 30 días");
                break;
            case 2:
                System.out.println("Mes: " + mes + " tiene 28 días");
                break;
            default:
                System.out.println("Mes incorrecto");
        }
    }

    private static void Ejercicio4() {
        Scanner scan2 = new Scanner(System.in);
        int departamento;

        System.out.print("Departamento(1-4):" );
        departamento = scan2.nextInt();
        switch (departamento){
            case 1:
                System.out.println("Desarrollo");
                break;
            case 2:
                System.out.println("RRHH");
                break;
            case 3:
                System.out.println("Finanzas");
                break;
            case 4:
                System.out.println("Marketing");
                break;
            default:
                System.out.println("No existe departamento");
        }
    }



    private static void Ejercicio3() {
        int nLados;
        double longitud, apotema, area;
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Numero de lados: ");
        nLados = scan3.nextInt();

        System.out.println("Numero de longitud: ");
        longitud = scan3.nextDouble();

        System.out.println("Numero de apotema: ");
        apotema = scan3.nextDouble();
        area = (nLados * longitud) * apotema / 2;

        System.out.println("Area: " + area);

    }

    private static void Ejercicio1(){
        // Aqui empieza el programa
        int i1, i2;
        double d1,d2 = 8.8, resul;
        float f1, f2;
        String s1 = "Hola";
        char c1 = 'a';
        boolean b1 = true, b2 = false;

        System.out.println("Hola Mundo");

        System.out.println(b1);

        d1 = 6.6;

        resul = d1 + d2;

        System.out.println("Resultado: " + resul);

        // String es un objeto
        System.out.println(s1.substring(3));

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Introduce numero: ");
        int rs = scan1.nextInt();
        System.out.println("Valor del teclado entero: " + rs);
        switch (rs){
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            case  7:
                System.out.println("Notable");
                break;
            default:
                System.out.println("Suspenso");
        }
        if (rs % 2 == 0){
            System.out.println("El numero: " + rs + " es par");}
        else {
            System.out.println("El numero: " + rs + " es impar");};


        System.out.println("Valor: " + rs);

    }

}

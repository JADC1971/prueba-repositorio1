package com.cadena;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] izqValores = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] derValores = {50.0, 92.0, 17.0, 3.0};
        char []  opCodigos  = {'d', 'a', 's', 'm'};
        double[] resultados = new double[opCodigos.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodigos.length; i++) {
                resultados[i] = ejecutaOperacion(opCodigos[i], izqValores[i], derValores[i]);
            }
            for (double valor : resultados)
                System.out.println(valor);
        } else if (args.length == 1 && args[0].equals("interactivo"))
                    ejecutarInterativamente();
                else if(args.length == 3)
                    ejecutarLineaComando(args);
                else
                    System.out.println("Por favor proporciones un código de operación y 2 valores numéricos");
    }

    static void ejecutarInterativamente(){
        System.out.println("Operacion y dos numeros:");
        Scanner escanear = new Scanner(System.in);
        String userInput =  escanear.nextLine();
        String[] palabras = userInput.split(" ");
        ejecucionInteractivo(palabras);
    }

    static void ejecucionInteractivo(String[] palabras) {
        char opCode = codigoOperacionCadena(palabras[0]);
        if (opCode =='w')
            manipularCuando(palabras);
        else {
            double valor1 = valorDeUnaPalabra(palabras[1]);
            double valor2 = valorDeUnaPalabra(palabras[2]);
            double resultado = ejecutaOperacion(opCode, valor1, valor2);
            visualizarResultado(opCode, valor1, valor2, resultado);
            System.out.println(resultado);
        }
    }

    private static void manipularCuando(String[] palabras) {
        LocalDate startDate  = LocalDate.parse(palabras[1]);
        long daysToAdd = (long) valorDeUnaPalabra(palabras[2]);
        LocalDate nuevaFecha = startDate.plusMonths(daysToAdd);
        System.out.println(String.format("Fecha %s + %d = %s", startDate, daysToAdd, nuevaFecha));
        //Operacion y dos numeros:
        //w 2020-10-25 nueve
        //Fecha 2020-10-25 + 9 = 2021-07-25
    }

    private static void visualizarResultado(char opCode, double valor1, double valor2, double resultado) {
        StringBuilder mensaje = new StringBuilder(20);
        char operador = cargaOperador(opCode);
        mensaje.append(valor1);
        mensaje.append(" ");
        mensaje.append(operador);
        mensaje.append(" ");
        mensaje.append(valor2);
        mensaje.append(" = ");
        mensaje.append(resultado);
        System.out.println(mensaje.toString());
        int pos = mensaje.indexOf(String.valueOf(operador)); //Localiza la posicion del operador
        mensaje.insert(pos, operador);                       //Inserta de nuevo el operador 9.0 ** 4.0 = 36.0
        System.out.println(mensaje.toString());

        // ---------------- Concatenation vs. Formating
        int david = 17, dawson = 15, dillon = 8, gordon = 6;
        double media = 0.0d;
        String s1 = "My nephews are " + david +", " + dawson + ", " + dillon + ", and " + gordon + " years old";
        String s2 = String.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
        System.out.println(s1);
        System.out.println(s2);
        media = (david + dawson + dillon + gordon) / 4;
        s1 = "La media de edad es de " + media + " años";
        s2 = String.format("La media de edad es de %.1f años", media);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Formateo de cadena ");
        s1 = String.format("%.3f %c %.3f = %.3f", valor1, operador, valor2, resultado);
        System.out.println(s1);

        s2 = String.format("%4$d %3$d %2$d %<d", david, dawson, dillon, gordon );
        System.out.println(s2);
        //Operacion y dos numeros:
        //a nueve nueve
        //9.0 + 9.0 = 18.0
        //9.0 ++ 9.0 = 18.0
        //My nephews are 17, 15, 8, and 6 years old
        //My nephews are 17, 15, 8, and 6 years old
        //La media de edad es de 11.0 años
        //La media de edad es de 11,0 años
        //Formateo de cadena
        //9,000 + 9,000 = 18,000
        //6 8 15 15
        //18.0
    }

    private static char cargaOperador(char opCode) {
        char[] operacion = {'a', 's', 'm', 'd'};
        char[] operador = {'+', '-', '*', '/'};
        char resultado = ' ';
        for (int i = 0; i<operacion.length; i++){
            if (operacion[i] == opCode) {
                resultado = operador[i];
                break;
            }
        }
        return resultado;
    }

    private static void ejecutarLineaComando(String[] args) {
        char ope = args[0].charAt(0);
        double valor1 = Double.parseDouble(args[1]);
        double valor2 = Double.parseDouble(args[2]);

        System.out.println(ejecutaOperacion(ope, valor1, valor2));
    }

    static double ejecutaOperacion(char opCodigo, double izqValor, double derValor) {
        double resultado = 0.0d;
        switch (opCodigo) {
            case 'a':
                resultado = izqValor + derValor;
                break;
            case 's':
                resultado = izqValor - derValor;
                break;
            case 'm':
                resultado = izqValor * derValor;
                break;
            case 'd':
                resultado = derValor != 0 ? izqValor / derValor : 0.0d;
                break;
            default:
                System.out.println("Código de operación nvalido: " + opCodigo);
                resultado = 0.0;
                break;
        }
        return resultado;
    }
    static char codigoOperacionCadena(String nombreOperacion){
        char opCode = nombreOperacion.charAt(0);
        return opCode;
    }

    static double valorDeUnaPalabra(String palabra) {
        String[] numberWords = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        double valor = -1d;

        for (int i=0; i< numberWords.length;i++){
            if(palabra.equals(numberWords[i])){
                valor = i;
                break;
            }
        if (valor == -1d)
            valor = Double.parseDouble(palabra);
        }
        return valor;
    }
}

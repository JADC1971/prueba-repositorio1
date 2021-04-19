package com.TitleConverter;

public class TitlecaseConverter {
    public static String ConvertirAMayusculas(String entrada){
        StringBuilder resultado = new StringBuilder();
        for (String palabra : entrada.split("\\s")){
            if (palabra.length()<4) {
                resultado.append(palabra.toLowerCase());
            } else {
                resultado.append(palabra.substring(0,1).toUpperCase());
                resultado.append(palabra.substring(1).toLowerCase());
            }
            resultado.append(" ");
        }
        return resultado.toString();
    }
}

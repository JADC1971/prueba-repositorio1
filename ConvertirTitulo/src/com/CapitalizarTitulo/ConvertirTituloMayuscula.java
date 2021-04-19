package com.CapitalizarTitulo;

public class ConvertirTituloMayuscula {
    public static String convertirAMayuscula(String titulo){
        StringBuilder resultado = new StringBuilder();

        for (String palabra : titulo.split("\\s")){
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

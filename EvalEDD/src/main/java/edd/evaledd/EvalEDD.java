/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd.evaledd;

/**
 *
 * @author 58414
 */
public class EvalEDD {

    public static void main(String[] args) {
        String[][] infoClientes = {
            {"Silvestre Cárdenas", "8"},
            {"Andrés López", "1"},
            {"Andreina Gonzalez", "5"},
            {"Maria Perez", "0"},
            {"Armando Paredes", "10"}
        };
        imprimirSatisfaccion(infoClientes);
        
    }
    
    
    public static void imprimirSatisfaccion(String[][] datos){
        for (String[] cliente : datos) {
            String estadoCliente = "registro sin clasificar";
            int satisfaccion = Integer.valueOf(cliente[1]);
            if(satisfaccion < 1){
                estadoCliente="el cliente no antendio";
            }
            if ((satisfaccion > 0) && (satisfaccion < 5)) {
                estadoCliente="cliente no satisfecho";
            }
            if (satisfaccion == 5) {
                estadoCliente="cliente neutro";
            }
            
            if ((satisfaccion > 5) && (satisfaccion < 9)) {
                estadoCliente="cliente satisfecho";
            }
            
            if ((satisfaccion) > 8 && (satisfaccion < 11)) {
                estadoCliente="cliente muy satisfecho";
            }
            
            System.out.println("El cliente " + cliente[0] + " presenta un estado de satisfaccion de " + satisfaccion + " por lo tanto " + estadoCliente);
        }
    }
    
    
    public static String[] llenarLista(String[] lista, String texto){
        String[] arrayTexto = texto.split(" ");
        if(arrayTexto.length > 1){
            lista[lista.length]=arrayTexto[0];
            String texto_aux="";
            for (int i = 1; i < arrayTexto.length; i++) {
                texto_aux=" "+texto_aux;
            }
            return llenarLista(lista, texto_aux);
        }else{
            return lista;
        }
    }
    
    
    
    
    
}

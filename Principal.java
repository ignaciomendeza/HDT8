/*
 * Diego Soto (22737), Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 03-04-2023
 * Clase Principal: Interacción con el usuario
 */

import java.util.*;
import java.util.Scanner;


public class Principal {

    
    /** 
     * @param args
     */
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        Archivo archivo = new Archivo("./procesos.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();
        ArrayList<String> unaLinea = new ArrayList<String>();
        Prioridad prioridad = new Prioridad();

        System.out.println();
        int tipo = 0;
        boolean seguir = true;
        String menu = "-----------------------------------CHICHICASTE LINUX-----------------------------------";
        System.out.println(menu);
        String resultado = "";


        for (String fila : lineasDatos) {
            String [] lineaSeparada = fila.split(",");
            unaLinea = new ArrayList<String>();
            for (String caracter : lineaSeparada) {
                unaLinea.add(caracter);
            }

            try {
                prioridad.crearProceso(unaLinea.get(0), unaLinea.get(1), Integer.parseInt(unaLinea.get(2)));
                prioridad.obtenerPrioridad();
                prioridad.insertar();
                prioridad.insertar2();
                resultado = resultado + prioridad.getProceso().toString2() + "\n";

            } catch (Exception nullException) {
                System.out.println("No se pudo realizar la operación, revise archivo de entrada");
            }
        }

        System.out.println("*PROCESOS INGRESADOS*");
        System.out.println(resultado);
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|CLASE 'VECTOR HEAP'|");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("*ORDEN DE ATENCIÓN*");
        while (prioridad.getMyHeap().size() > 0){
            Proceso proceso = prioridad.eliminar();
            System.out.println(proceso);
        }
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|JAVA COLLECTION FRAMEWORK 'PRIORITY QUEUE'|");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("*ORDEN DE ATENCIÓN*");
        while (prioridad.getPrio().size() > 0){
            Proceso proceso = prioridad.eliminar2();
            System.out.println(proceso);
        }
        System.out.println();

        





        







        
        
    }
}
import java.util.Comparator;
/*
 * Diego Soto (22737), Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 03-04-2023
 * Clase Proceso: Crea un proceso
 */

//Obtenida de (c) 1998, 2001 duane a. bailey

public class Proceso implements Comparable{
    private String nombreProceso;
    private String nombreUsuario;
    private int valorNice;
    private int pr;
    
    public Proceso() {
        this.nombreProceso = "";
        this.nombreUsuario = "";
        this.valorNice = 0;
        this.pr = 0;
    }

    public Proceso(String nombreProceso, String nombreUsuario, int valorNice) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorNice = valorNice;
        this.pr = 0;
    }

    public Proceso(String nombreProceso, String nombreUsuario, int valorNice, int pr) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorNice = valorNice;
        this.pr = pr;
    }


    /** Devuelve el nombre del proceso
     * @return String
     */
    public String getNombreProceso() {
        return this.nombreProceso;
    }

    
    /** Cambia el nombre del proceso
     * @param nombreProceso
     */
    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    
    /** Devuelve el nombre del usuario
     * @return String
     */
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    
    /** Cambia el nombre del usuario
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    /** Devuelve el valor nice
     * @return int
     */
    public int getValorNice() {
        return this.valorNice;
    }

    
    /** Cambia el valor nice
     * @param valorNice
     */
    public void setValorNice(int valorNice) {
        this.valorNice = valorNice;
    }

    
    /** Devulve el Proceso
     * @param nombreProceso
     * @return Proceso
     */
    public Proceso nombreProceso(String nombreProceso) {
        setNombreProceso(nombreProceso);
        return this;
    }

    
    /** Devuelve el Proceso
     * @param nombreUsuario
     * @return Proceso
     */
    public Proceso nombreUsuario(String nombreUsuario) {
        setNombreUsuario(nombreUsuario);
        return this;
    }

    
    /** Devuelve el Proceso
     * @param valorNice
     * @return Proceso
     */
    public Proceso valorNice(int valorNice) {
        setValorNice(valorNice);
        return this;
    }

    
    /** Devuelve la prioridad
     * @return int
     */
    public int getPr() {
        return this.pr;
    }

    
    /** Cambia la prioridad
     * @param pr
     */
    public void setPr(int pr) {
        this.pr = pr;
    }

    
    /** Devuelve el Proceso
     * @param pr
     * @return Proceso
     */
    public Proceso pr(int pr) {
        setPr(pr);
        return this;
    }
    
    
    /** Método para comparar la prioridad de los procesos
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if (pr == ((Proceso) o).getPr())
			return 0;
		else if ((pr > ((Proceso) o).getPr()))
			return 1;
		else 
			return -1;
    }
    
    
    /** Método para imprimir los atributos con sus valores
     * @return String
     */
    @Override
    public String toString() {
        return 
            "Nombre del Proceso: " + getNombreProceso() + ", " + 
            "Nombre del Usuario: " + getNombreUsuario() + ", " +
            "Valor Nice: " + getValorNice() + ", " +
            "Prioridad: " + getPr();
    }

    
    /** Método para imprimir los atributos con sus valores
     * @return String
     */
    public String toString2() {
        return 
            "Nombre del Proceso: " + getNombreProceso() + ", " + 
            "Nombre del Usuario: " + getNombreUsuario() + ", " +
            "Valor Nice: " + getValorNice();
    }
}
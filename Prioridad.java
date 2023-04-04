import java.util.*;
/*
 * Diego Soto (22737), Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 03-04-2023
 * Clase Prioridad: Controladora
 */

public class Prioridad {

    private Proceso proceso;
    private VectorHeap<Proceso> myHeap;
    private PriorityQueue<Proceso> prio;

    public Prioridad() {
        this.myHeap = new VectorHeap<Proceso>(); 
        this.proceso = new Proceso();
        this.prio = new PriorityQueue<Proceso>();
    }
    
    public Prioridad(VectorHeap<Proceso> myHeap, PriorityQueue<Proceso> prio, Proceso proceso) {
        this.myHeap = myHeap;
        this.proceso = proceso;
        this.prio = prio;
    }

    
    /** Devuelve el Priority Queue de Procesos
     * @return PriorityQueue<Proceso>
     */
    public PriorityQueue<Proceso> getPrio() {
        return this.prio;
    }

    
    /** Cambia el Priority Queue de Procesos
     * @param prio
     */
    public void setPrio(PriorityQueue<Proceso> prio) {
        this.prio = prio;
    }
    
    
    /** Devuelve el Vector Heap de Procesos
     * @return VectorHeap<Proceso>
     */
    public VectorHeap<Proceso> getMyHeap() {
        return this.myHeap;
    }

    
    /** Cambia el Vector Heap de Procesos
     * @param myHeap
     */
    public void setMyHeap(VectorHeap<Proceso> myHeap) {
        this.myHeap = myHeap;
    }
    

    /** Devuelve el Proceso
     * @return Proceso
     */
    public Proceso getProceso() {
        return this.proceso;
    }

    
    /** Cambia el Proceso
     * @param proceso
     */
    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    
    /** Devuelve la Prioridad
     * @param proceso
     * @return Prioridad
     */
    public Prioridad proceso(Proceso proceso) {
        setProceso(proceso);
        return this;
    }
    
    /**
     * Método para asignarle la prioridad a un Proceso
     */
    public void obtenerPrioridad(){
        int prioridad = 100;
        int par = 20;
        par = par + proceso.getValorNice();
        prioridad = prioridad + par;
        proceso.setPr(prioridad);
    }

    /**
     * Método para insertar un proceso al VectorHeap
     */
    public void insertar(){
        myHeap.add(proceso);
    }

    /**
     * Método para insertar un proceso a la Priority Queue
     */
    public void insertar2(){
        prio.add(proceso);
    }

    
    /** Método para eliminar un proceso del VectorHeap
     * @return Proceso
     */
    public Proceso eliminar(){
        return myHeap.remove();
    }

    
    /** Método para eliminar un proceso de la Priority Queue
     * @return Proceso
     */
    public Proceso eliminar2(){
        return prio.remove();
    }

    
    /** Método para crear un nuevo Proceso 
     * @param nombre1
     * @param nombre2
     * @param val1
     */
    public void crearProceso(String nombre1, String nombre2, int val1){
        proceso = new Proceso(nombre1, nombre2, val1); 
    }
}

public class Prioridad {
    private HeapUsingIterativeBinaryTree<Integer, Proceso> myHeap;
    private Proceso proceso;
    

    public Prioridad() {
        this.myHeap = new HeapUsingIterativeBinaryTree<Integer, Proceso>(new ComparadorNumeros<Integer>()); 
    }

    public Prioridad(HeapUsingIterativeBinaryTree<Integer,Proceso> myHeap) {
        this.myHeap = myHeap;
    }

    public HeapUsingIterativeBinaryTree<Integer,Proceso> getMyHeap() {
        return this.myHeap;
    }

    public void setMyHeap(HeapUsingIterativeBinaryTree<Integer,Proceso> myHeap) {
        this.myHeap = myHeap;
    }

    public Prioridad myHeap(HeapUsingIterativeBinaryTree<Integer,Proceso> myHeap) {
        setMyHeap(myHeap);
        return this;
    }
    
    public int obtenerPrioridad(int nice){
        int prioridad = 100;
        int par = 20;
        par = par + nice;
        prioridad = prioridad + nice;
        return prioridad;
    }

    public void insertar(int prioridad, Proceso proceso){
        myHeap.Insert(prioridad, proceso);
    }

    public Proceso eliminar(){
        return myHeap.remove();
    }

    public Proceso crearProceso(String nombre1, String nombre2, int val1, int val2){
        proceso = new Proceso(nombre1, nombre2, val1, val2);
        return proceso; 
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Diego Soto (22737) y Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase TRaTest: Pruebas Unitarias
 */


class ProcesoTest {

	@Test
	void ordenarSegunPr() {
		HeapUsingIterativeBinaryTree<Integer, Proceso> myHeap = new HeapUsingIterativeBinaryTree<Integer, Proceso>(new ComparadorNumeros<Integer>());
		Proceso pro1 = new Proceso("hola", "diego", -20, 100);
		Proceso pro2 = new Proceso("hola1", "diego1", 0, 120);
		Proceso pro3 = new Proceso("hola2", "diego2", 19, 139);
		Proceso pro4 = new Proceso("hola3", "diego3", -10, 110);

		myHeap.Insert(139, pro3)	;
		myHeap.Insert(120, pro2);
		myHeap.Insert(100, pro1);
		myHeap.Insert(110, pro4);
		
		assertEquals(100, myHeap.remove().getPr());
		assertEquals(110, myHeap.remove().getPr());
		assertEquals(120, myHeap.remove().getPr());
		assertEquals(139, myHeap.remove().getPr());

	}

	

}
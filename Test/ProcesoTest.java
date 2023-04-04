import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

/*
 * Diego Soto (22737) y Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase TRaTest: Pruebas Unitarias
 */


class ProcesoTest {
	VectorHeap<Proceso> myHeap = new VectorHeap<Proceso>();
	PriorityQueue<Proceso> prio = new PriorityQueue<Proceso>();

	@Test
	void insertarVector() {
		Proceso pro1 = new Proceso("hola", "diego", -20, 100);
		Proceso pro2 = new Proceso("hola1", "diego1", 0, 120);
		Proceso pro3 = new Proceso("hola2", "diego2", 19, 139);
		Proceso pro4 = new Proceso("hola3", "diego3", -10, 110);

		myHeap.add(pro3);
		myHeap.add(pro2);
		myHeap.add(pro1);
		myHeap.add(pro4);
		
		assertEquals(4, myHeap.size());
	}

	@Test
	void ordenarSegunPrVector() {
		Proceso pro1 = new Proceso("hola", "diego", -20, 100);
		Proceso pro2 = new Proceso("hola1", "diego1", 0, 120);
		Proceso pro3 = new Proceso("hola2", "diego2", 19, 139);
		Proceso pro4 = new Proceso("hola3", "diego3", -10, 110);

		myHeap.add(pro3);
		myHeap.add(pro2);
		myHeap.add(pro1);
		myHeap.add(pro4);

		assertEquals(100, myHeap.remove().getPr());
		assertEquals(110, myHeap.remove().getPr());
		assertEquals(120, myHeap.remove().getPr());
		assertEquals(139, myHeap.remove().getPr());
	}

	@Test
	void insertarPriority() {
		Proceso pro1 = new Proceso("hola", "diego", -20, 100);
		Proceso pro2 = new Proceso("hola1", "diego1", 0, 120);
		Proceso pro3 = new Proceso("hola2", "diego2", 19, 139);
		Proceso pro4 = new Proceso("hola3", "diego3", -10, 110);

		prio.add(pro3);
		prio.add(pro2);
		prio.add(pro1);
		prio.add(pro4);
		
		assertEquals(4, prio.size());
	}

	@Test
	void ordenarSegunPrPriority() {
		Proceso pro1 = new Proceso("hola", "diego", -20, 100);
		Proceso pro2 = new Proceso("hola1", "diego1", 0, 120);
		Proceso pro3 = new Proceso("hola2", "diego2", 19, 139);
		Proceso pro4 = new Proceso("hola3", "diego3", -10, 110);

		prio.add(pro3);
		prio.add(pro2);
		prio.add(pro1);
		prio.add(pro4);

		assertEquals(100, prio.remove().getPr());
		assertEquals(110, prio.remove().getPr());
		assertEquals(120, prio.remove().getPr());
		assertEquals(139, prio.remove().getPr());
	}

	

	

}
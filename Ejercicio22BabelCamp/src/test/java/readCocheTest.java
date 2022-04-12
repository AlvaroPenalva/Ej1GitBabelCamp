import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import modelo.Entidad.Coche;
import modelo.negocio.CocheSA;

@TestInstance(Lifecycle.PER_CLASS)
public class readCocheTest {
	
	CocheSA csa = new CocheSA();
	
	//No se esta ejecutando el BeforeAll
	@BeforeAll
	public void initialize() {
		this.csa = new CocheSA();
	}
	
	@Test
	public void testLeerCoche(){
		int id = 8;
		Coche car = csa.getCocheID(id);
		Assertions.assertEquals(id, car.getId());
	}

}

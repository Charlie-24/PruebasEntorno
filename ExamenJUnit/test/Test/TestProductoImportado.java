package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Aranceles.ProductoImportado;
import Aranceles.ServicioAranceles;

class TestProductoImportado {

	
	@Test
	void testCalcularArancelProducto() {
		
		ProductoImportado p1 = new ProductoImportado("Armario","China",60,"textil");
		double resultado = ServicioAranceles.calcularArancel(p1);
		assertEquals(26.4,resultado);
	}

	@Test
	void testAgregarArancelPaisTasaInvalida() {
		
		Exception exception= assertThrows(IllegalArgumentException.class, () ->{
			ServicioAranceles.agregarArancelPais("España",1.5);
		});
		assertEquals("La tasa de arancel debe estar entre 0.0 y 1.0",exception.getMessage());
		
		
	}

}

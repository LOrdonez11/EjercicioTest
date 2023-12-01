import TestCase.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Main extends BaseTest {

    @Test (priority = 1)
    public void agregarProducto(){
        testCaseProd1.botonProducto1();

        carrito1.traerTextoCarrito();

       String textCompra = carrito1.traerTextoCarrito();
       assertEquals(textCompra, "Finalizar compra");
    }
    @Test (priority = 2)
    public void agregarProdCantidad(){
        testCaseProd2.botonesProd2();
        carrito1.traerTextoCarrito();
        String textCompra = carrito1.traerTextoCarrito();
        assertEquals(textCompra, "Finalizar compra");
    }
}

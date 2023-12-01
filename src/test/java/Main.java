import TestCase.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Main extends BaseTest {

    @Test
    public void inciarSesion(){

        login.inicioSesion();
        String textoInicio = inicio.traerTextoInicio();
        assertEquals(textoInicio, "Dashboard");



    }
}

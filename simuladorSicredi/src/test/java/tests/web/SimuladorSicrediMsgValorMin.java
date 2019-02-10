package tests.web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FormSimular;
import suporte.Web;
import static org.junit.Assert.*;

public class SimuladorSicrediMsgValorMin {

    private WebDriver navegador;
    @Before
    public void setUp(){
        //acessa o navegador pelo driver
        // navegador = Web.createChrome();

        navegador = Web.createChrome();
    }

    @Test
    public void testSimulaInvestimento(){
      String TextoValorAplicarError =  new FormSimular(navegador)
                .digitarValorAplicado("18,00")
                .digitarValorPoupado("15,00")
                .capturarTextoValorAplicarError();

      assertEquals("Valor mínimo de 20.00",TextoValorAplicarError);


    }

}

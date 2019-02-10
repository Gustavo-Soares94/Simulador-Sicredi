package tests.web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FormSimular;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class SimuladorSicrediCorreto {

    private WebDriver navegador;
    @Before
    public void setUp(){
        //acessa o navegador pelo driver
        // navegador = Web.createChrome();

        navegador = Web.createChrome();
    }
    @Test
    public void testSimulaInvestimento(){
         new FormSimular(navegador)
                .digitarValorAplicado("30.000,00")
                .digitarValorPoupado("2.000,00")
                .digitarTempo("12")
                .clicarBtnSimular();
    }
}


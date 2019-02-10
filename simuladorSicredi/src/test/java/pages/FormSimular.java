package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSimular extends BasePage {

    public FormSimular(WebDriver navegador) {
        super(navegador);
    }

    public FormSimular digitarValorAplicado(String valorAplicar){
        navegador.findElement(By.id("valorAplicar")).sendKeys(valorAplicar);

        return this;
    }

    public FormSimular digitarValorPoupado(String valorInvestir){
        navegador.findElement(By.id("valorInvestir")).sendKeys(valorInvestir);

        return this;
    }

    public FormSimular digitarTempo(String tempo){
        navegador.findElement(By.id("tempo")).sendKeys(tempo);

        return this;
    }

    public ResultadoSimulacao clicarBtnSimular(){
        navegador.findElement(By.className("simular")).click();

        return new ResultadoSimulacao(navegador);

    }

    public String capturarTextoValorAplicarError(){
        return navegador.findElement(By.id("valorAplicar-error")).getText();

    }


}

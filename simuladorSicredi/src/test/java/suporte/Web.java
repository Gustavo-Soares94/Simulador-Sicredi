package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static final String USERNAME = "gustavosoares2";
    public static final String AUTOMATE_KEY = "qwxT3zyNvzf3VSnfT5FR";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver createChrome(){
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gustavo.soares\\drivers\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize(); //maximizar tela
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //Ajustar bug time out

        // Navegando para a pagina do taskit
        navegador.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");

        return navegador;
    }

// testes na nuvem
    public static WebDriver createBrowserStack(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "71.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");

        WebDriver navegador = null;
        try {
            navegador = new RemoteWebDriver(new URL(URL), caps);
            navegador.manage().window().maximize(); //maximizar tela
            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //Ajustar bug time out

            // Navegando para a pagina do taskit
            navegador.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        } catch (MalformedURLException e) {
            System.out.println("Houveram problemas com a URL" + e.getMessage());
        }



        return navegador;

    }


}

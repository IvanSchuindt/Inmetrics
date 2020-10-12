package br.com.inmetrics.teste.utils;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static WebDriver driver;

    public WebDriver getDriver() throws Exception{
        driver = new ChromeDriver();
        System.out.println("Navegador Iniciado!");
        return driver;
    }

    @BeforeSuite
    public static void openBrowser() {
        driver.get("http://www.inmrobo.tk/accounts/signup/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Abrir o Navegador: Navegador foi Aberto");
    }

    @AfterSuite
    public static void closeBrowser() {
        driver.quit();
        System.out.println("Fechar o Navegador: Navegador foi Fechado");
    }
}
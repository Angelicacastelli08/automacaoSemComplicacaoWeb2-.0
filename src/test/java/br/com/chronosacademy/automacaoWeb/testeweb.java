package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertEquals;

public class testeweb {
    Driver driverWeb;
    WebDriver driver;
    PrincipalPage principalPage;
    CursoPage cursoPage;

  @Before
  public void inicializa Test() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    public Driver(String navegador){
      switch (navegador) {

          case "chrome":
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;
          case "ie":
              WebDriverManager.chromedriver().setup();
              driver = new InternetExplorerDriver();
              break;

          case "firefox":
              WebDriverManager.chromedriver().setup();
              driver = new FirefoxDriver();
              break;
          case "edge":
              WebDriverManager.chromedriver().setup();
              driver = new EdgeDriver();
              break;
          default:
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;

      }
      driver.manage().window().maximize();
    }

        @Test
        public void primeiroTeste(){

            String titulo = PrincipalPage.getTitulo();

            assertEquals("Porque Tempo É Conhecimento",titulo);
        }
        @Test
        public void  segundoTeste(){
          PrincipalPage.clickBotao("//body/div/div/div/div/div/section[2]//a");
            String titulo =cursoPage.getTitulo2();
            assertEquals("AUTOMAÇÃO SEM COMPLICACÃO WEB 2.0",titulo);

        }

    @After
        public void finalizaTest(){
            driver.quit();
       }
}
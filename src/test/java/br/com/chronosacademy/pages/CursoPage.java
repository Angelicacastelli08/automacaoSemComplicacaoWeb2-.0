package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.CursoMap;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver,cursoMap);
    }
    public String getTitulo2(){
       return cursoMap.h2Titulo.getText();
    }
    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao = "//body/div/div/div/div/div/section[2]//a";
        String Titulo = cursoPage.getTitulo2();
        assertEquals = ("AUTOMAÇÃO SEM COMPLICACÃO WEB 2.0",titulo);
    }
}

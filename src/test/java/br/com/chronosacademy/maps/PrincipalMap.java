package br.com.chronosacademy.maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    private WebDriver driver;
    private PrincipalMap principalMap;
    public WebElement txtTitulo;

    public WebElement btnTitulo;
    }
public class PrincipalMap{
    @FindBy(xpath="//section[2]/div[3]//a")
    public WebElement btnTitulo;
}

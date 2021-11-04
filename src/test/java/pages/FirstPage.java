package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage extends BasePage{
    public FirstPage(WebDriver navegador) {
        super(navegador);
    }

    public ReturnPage pesquisarProduto(){
        navegador.findElement(By.name("as_word")).sendKeys("harley davison");
        navegador.findElement(By.xpath("//button[@class=\"nav-search-btn\"]")).click();
        return new ReturnPage(navegador);
    }
}

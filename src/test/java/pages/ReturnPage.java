package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnPage extends BasePage{
    public ReturnPage(WebDriver navegador) {
        super(navegador);
    }

    public String produtoPesquisado(){
        return navegador.findElement(By.xpath("//h1[@class=\"ui-search-breadcrumb__title\"]")).getText();
    }
}

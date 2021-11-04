package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FirstPage;
import support.Web;

import static org.junit.Assert.*;

public class ValidarTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }
    @After
    public void tearDown(){
        navegador.quit();
    }
    @Test
    public void testValidarProdutoPesquisado(){
        String produtoPesquisado = new FirstPage(navegador)
                .pesquisarProduto()
                .produtoPesquisado();

        assertEquals("Harley davison", produtoPesquisado);

    }
}

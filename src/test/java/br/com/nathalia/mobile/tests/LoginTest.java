package br.com.nathalia.mobile.tests;

import br.com.nathalia.mobile.base.BaseTest;
import br.com.nathalia.mobile.pages.HomeLoginPage;
import br.com.nathalia.mobile.pages.CpfLoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void deveIniciarLoginComCpf() {

        HomeLoginPage home = new HomeLoginPage(driver);
        CpfLoginPage cpfPage = new CpfLoginPage(driver);

        home.clicarAcessarConta();
        cpfPage.digitarCpf("11122233344");
        cpfPage.clicarAcessar();
    }
}
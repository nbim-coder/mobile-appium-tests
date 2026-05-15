package br.com.nathalia.mobile.tests;

import br.com.nathalia.mobile.base.BaseTest;
import br.com.nathalia.mobile.pages.HomeLoginPage;
import br.com.nathalia.mobile.pages.CpfLoginPage;
import br.com.nathalia.mobile.data.TestData;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void deveIniciarLoginComCpf() {

        HomeLoginPage home = new HomeLoginPage(driver);
        CpfLoginPage cpfPage = new CpfLoginPage(driver);

        home.clicarAcessarConta();
        cpfPage.digitarCpf(TestData.CPF_VALIDO);

        // ✅ ASSERT (agora é teste de verdade)
        assertTrue(cpfPage.botaoAcessarVisivel());
    }
}
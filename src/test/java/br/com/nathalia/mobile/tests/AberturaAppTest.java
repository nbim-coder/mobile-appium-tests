
package br.com.nathalia.mobile.tests;

import br.com.nathalia.mobile.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AberturaAppTest extends BaseTest {

    @Test
    public void deveAbrirAplicativo() {
        assertNotNull(driver);
        System.out.println("✅ Aplicativo aberto com sucesso!");
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    void deveRetornarFuncaoFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncao("Engenheiro");

        assertEquals("Engenheiro", funcionario.getFuncao());
    }

    @Test
    void deveRetornarPreco() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncao("Engenheiro");

        assertEquals(1100.0f, funcionario.getPreco());
    }

}

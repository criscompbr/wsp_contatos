import org.junit.Test;

import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveTerOitoFuncionario(){
        Funcionario f = new Funcionario();
        f.inicializar();
        assertEquals(f.getCadastro().size(), 8);
    }

    @Test
    public void deveAdicionarMaisUmFuncionarioTotalNove(){
        Funcionario f = new Funcionario();
        f.inicializar();
        f.setCodFuncionario(9);
        f.setNome("Cristiano");
        f.setSobrenome("Thomas");
        f.setIdade(30);
        f.setTelefone("37131826");
        f.setEndereco("Rua do Parque");
        f.setCodCargo(3);
        f.setCodEscritorio(1);
        f.cadastro.add(f);
        assertEquals(f.getCadastro().size(), 9);
    }


}
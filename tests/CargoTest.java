import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CargoTest {

    @Test
    public void deveTerCincoCargo(){
        Cargo c = new Cargo();
        c.inicializar();
        assertEquals(c.getCadastroCargo().size(), 5);
    }

    @Test
    public void deveConfererCargo(){
        String[] expected = new String[] {
                "Diretor",
                "Gerente",
                "Estagiária",
                "Assistente",
                "Cozinheiro"
        };

        Cargo c = new Cargo();
        c.inicializar();
        Integer num = 0;
        for(Cargo ca: c.cadastroCargo){
            assertEquals(ca.getNomeCargo(), expected[num]);
            num++;
        }
    }
}

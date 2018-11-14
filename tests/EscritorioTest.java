import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EscritorioTest {

    @Test
    public void deveTerQuatroEscritorio(){
        Escritorio e = new Escritorio();
        e.inicializar();
        assertEquals(e.getCadastroEscritorio().size(), 4);
    }

    @Test
    public void deveConfererEscritorio(){
        String[] expected = new String[] {
            "Viamão",
            "Montenegro",
            "Guaiba",
            "Pelotas"
        };

        Escritorio e = new Escritorio();
        e.inicializar();
        Integer num = 0;
        for(Escritorio es: e.cadastroEscritorio){
            assertEquals(es.getNomeEscritorio(), expected[num]);
            num++;
        }


    }
}

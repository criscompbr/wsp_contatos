import java.util.ArrayList;

public class Escritorio {

    private int codEscritorio;
    private String nomeEscritorio;
    String[] arrayEscritorios = new String[] {
            "Viamão",
            "Montenegro",
            "Guaiba",
            "Pelotas"
    };

    ArrayList<Escritorio> cadastroEscritorio = new ArrayList<Escritorio>();

    public int getCodEscritorio() {
        return codEscritorio;
    }

    public void setCodEscritorio(int codEscritorio) {
        this.codEscritorio = codEscritorio;
    }

    public String getNomeEscritorio() {
        return nomeEscritorio;
    }

    public void setNomeEscritorio(String nomeEscritorio) {
        this.nomeEscritorio = nomeEscritorio;
    }

    public ArrayList<Escritorio> getCadastroEscritorio(){ return this.cadastroEscritorio; }

    public void lista(){
        for(Escritorio e: cadastroEscritorio){
            System.out.println(e.getCodEscritorio() + ": " + e.getNomeEscritorio());
        }
    }

    public void listaEscritorio(){
        for(Escritorio e: cadastroEscritorio){
            System.out.println(" " + e.getCodEscritorio() + ": " + e.getNomeEscritorio());
        }
    }

    public void inicializar(){
        int num = 1;
        for (String escritorio: arrayEscritorios) {
            Escritorio e = new Escritorio();
            e.setCodEscritorio(num++);
            e.setNomeEscritorio(escritorio);
            cadastroEscritorio.add(e);
        }
    }
}

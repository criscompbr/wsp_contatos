import java.util.ArrayList;

public class Cargo {
    private int codCargo;
    private String nomeCargo;
    String[] arrayCargos = new String[] {
            "Diretor", // 1
            "Gerente", // 2
            "Estagiária", // 3
            "Assistente", // 4
            "Cozinheiro" // 5
    };

    ArrayList<Cargo> cadastroCargo = new ArrayList<Cargo>();

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public ArrayList<Cargo> getCadastroCargo() { return this.cadastroCargo; }

    public void lista(){
        for(Cargo c: cadastroCargo){
            System.out.println(c.getCodCargo() + ": " + c.getNomeCargo());
        }
    }

    public void listaFuncionario(){
        for(Cargo c: cadastroCargo){
            System.out.println(" " + c.getCodCargo() + ": " + c.getNomeCargo());
        }
    }

    public void inicializar(){
        int num = 1;
        for (String cargo: arrayCargos) {
            Cargo c = new Cargo();
            c.setCodCargo(num++);
            c.setNomeCargo(cargo);
            cadastroCargo.add(c);
        }
    }


}

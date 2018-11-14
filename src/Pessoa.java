import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);
    private String nome, sobrenome, endereco, telefone;
    private int idade, codCargo, codEscritorio;

    ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public int getCodCargo() { return codCargo; }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public int getCodEscritorio() {
        return codEscritorio;
    }

    public void setCodEscritorio(int codEscritorio) {
        this.codEscritorio = codEscritorio;
    }

    public ArrayList<Pessoa> getCadastro() {
        return this.cadastro;
    }

    public void inicializar(){
        Arrays a = new Arrays();
        Funcionario f;

        for (int i = 0; i < a.nome.length; i++){
            f = new Funcionario();
            f.setCodFuncionario(i + 1);
            f.setNome(a.nome[i]);
            f.setSobrenome(a.sobrenome[i]);
            f.setIdade(a.idade[i]);
            f.setTelefone(a.telefone[i].toString());
            f.setEndereco(a.endereco[i]);
            f.setCodCargo(a.codCargo[i]);
            f.setCodEscritorio(a.codEscritorio[i]);
            cadastro.add(f);
        }

/*
        // Viamão - João Pedro
        f.setCodFuncionario(1);
        f.setNome("João");
        f.setSobrenome("Pedro");
        f.setIdade(32);
        f.setTelefone("99919999");
        f.setEndereco("Rua X, 190");
        f.setCodCargo(4);
        f.setCodEscritorio(1);
        cadastro.add(f);

        // Viamão - Carlos Eduardo
        f = new Funcionario();
        f.setCodFuncionario(2);
        f.setNome("Carlos");
        f.setSobrenome("Eduardo");
        f.setIdade(27);
        f.setTelefone("99913999");
        f.setEndereco("Rua Pedro Ivo, 1989");
        f.setCodCargo(1);
        f.setCodEscritorio(1);
        cadastro.add(f);

        // Viamão -Assis Brasil
        f = new Funcionario();
        f.setCodFuncionario(3);
        f.setNome("Assis");
        f.setSobrenome("Brasil");
        f.setIdade(49);
        f.setTelefone("93913999");
        f.setEndereco("Rua Carlos Lavced");
        f.setCodCargo(2);
        f.setCodEscritorio(1);
        cadastro.add(f);

        // Montenegro - Jussara Dias
        f = new Funcionario();
        f.setCodFuncionario(4);
        f.setNome("Jussara");
        f.setSobrenome("Dias");
        f.setIdade(19);
        f.setTelefone("94919999");
        f.setEndereco("Rua Varzea, 1967");
        f.setCodCargo(3);
        f.setCodEscritorio(2);
        cadastro.add(f);

        // Montenegro - Enzo Gomes
        f = new Funcionario();
        f.setCodFuncionario(5);
        f.setNome("Enzo");
        f.setSobrenome("Gomes");
        f.setIdade(29);
        f.setTelefone("90913999");
        f.setEndereco("Rua Farrapos, 199");
        f.setCodCargo(5);
        f.setCodEscritorio(2);
        cadastro.add(f);

        // Guaiba - Vivian Souza
        f = new Funcionario();
        f.setCodFuncionario(6);
        f.setNome("Vivian");
        f.setSobrenome("Souza");
        f.setIdade(21);
        f.setTelefone("96919999");
        f.setEndereco("Rua Joao Simplicio, 753");
        f.setCodCargo(2);
        f.setCodEscritorio(3);
        cadastro.add(f);

        // Pelotas - Damilia Paz
        f = new Funcionario();
        f.setCodFuncionario(7);
        f.setNome("Damilia");
        f.setSobrenome("Paz");
        f.setIdade(30);
        f.setTelefone("92919999");
        f.setEndereco("Rua Beon Mends, 190");
        f.setCodCargo(3);
        f.setCodEscritorio(4);
        cadastro.add(f);

        // Pelotas - Joao Freitas
        f = new Funcionario();
        f.setCodFuncionario(8);
        f.setNome("Joao");
        f.setSobrenome("Freitas");
        f.setIdade(57);
        f.setTelefone("87913999");
        f.setEndereco("Rua Bruna Oass, 1989");
        f.setCodCargo(1);
        f.setCodEscritorio(4);
        cadastro.add(f);
        */
    }

}

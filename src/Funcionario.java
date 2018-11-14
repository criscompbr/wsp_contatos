import java.util.ArrayList;

public class Funcionario extends Pessoa{

    private int codFuncionario;

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public void cadastrarFuncionario(){
        Funcionario f1 = new Funcionario();

        Cargo c = new Cargo();
        c.inicializar();

        Escritorio e = new Escritorio();
        e.inicializar();

        f1.setCodFuncionario(f1.getCodFuncionario() + 1);
        // Nome
        System.out.println("Digite o nome do funcionário: ");
        String getNome = sc.nextLine();
        while(true){
            if(getNome.isEmpty()){
                printObrigatorio("Nome");
                getNome = sc.nextLine();
            }else {
                break;
            }
        }
        f1.setNome(getNome);

        // Sobrenome
        System.out.println("Digite o sobrenome do funcionário: ");
        String getSobrenome = sc.nextLine();
        while(true){
            if(getSobrenome.isEmpty()){
                printObrigatorio("Sobrenome");
                getSobrenome = sc.nextLine();
            }else {
                break;
            }
        }
        f1.setSobrenome(getSobrenome);

        // Idade
        System.out.println("Digite a idade do funcionário: ");
        Integer getNumIdade = 0;
        String getIdade = sc.nextLine();
        while(true){
            if(getIdade.isEmpty()){
                printObrigatorio("Idade");
                getIdade = sc.nextLine();
            }else  if(getIdade.chars().allMatch( Character::isDigit )){
                getNumIdade = Integer.parseInt(getIdade);
                if(getNumIdade > 1 && getNumIdade <= 99){
                    break;
                }else{
                    System.out.println("Valor inválido! (os valores válidos são de 1 a 99 anos):");
                    getIdade = sc.nextLine();
                }
            }else{
                System.out.println("Somente 0 a 100 anos de idade e não é permitido -0 a -100 anos de idade");
                getIdade = sc.nextLine();
            }
        }
        f1.setIdade(getNumIdade);

        // Telefone
        System.out.println("Digite o telefone do funcionário: ");
        String getTelefone = sc.nextLine();
        while(true){
            if(getTelefone.isEmpty()){
                printObrigatorio("Telefone");
                getTelefone = sc.nextLine();
            }else if (validarTelefone(getTelefone)){
                break;
            }else{
                System.out.println("Necessita de um número de telefone no formato 999999999 ou 99999-9999");
                getTelefone = sc.nextLine();
            }
        }
        f1.setTelefone(getTelefone);

        // Endereço
        System.out.println("Digite o endereço do funcionário: ");
        String getEndereco = sc.nextLine();
        while(true){
            if(getEndereco.isEmpty()){
                printObrigatorio("Endereço");
                getEndereco = sc.nextLine();
            }else {
                break;
            }
        }
        f1.setEndereco(getEndereco);

        // Cargo - Coleta dados no cargo.java
        System.out.println("Digite o código do cargo do funcionário: ");
        c.listaFuncionario();
        Integer getNumFuncionario = 0;
        String getFuncionario = sc.nextLine();
        while(true){
            if(getFuncionario.isEmpty()){
                printObrigatorio("Funcionário");
                getFuncionario = sc.nextLine();
            }else if(getFuncionario.chars().allMatch( Character::isDigit )){
                getNumFuncionario = Integer.parseInt(getFuncionario);
                if(getNumFuncionario >= 1 && getNumFuncionario <= c.getCadastroCargo().size()){
                    break;
                }else{
                    System.out.println("Valor inválido! (os valores válidos são de 1 a " + c.getCadastroCargo().size() + "):");
                    getFuncionario = sc.nextLine();
                }
            }else{
                System.out.println("Único número permitido: ");
                getFuncionario = sc.nextLine();
            }
        }
        f1.setCodCargo(getNumFuncionario);

        // Escritorio - coleta dados no escritorio.java
        System.out.println("Digite o código do escritorio do funcionário: ");
        e.listaEscritorio();
        Integer getNumEscritorio = 0;
        String getEscritorio = sc.nextLine();
        while(true){
            if(getEscritorio.isEmpty()){
                printObrigatorio("Escritorio");
                getEscritorio = sc.nextLine();
            }else if(getEscritorio.chars().allMatch( Character::isDigit )){
                getNumEscritorio = Integer.parseInt(getEscritorio);
                if(getNumEscritorio >= 1 && getNumEscritorio <= e.getCadastroEscritorio().size()){
                    break;
                }else{
                    System.out.println("Valor inválido! (os valores válidos são de 1 a " + e.getCadastroEscritorio().size() + "):");
                    getEscritorio = sc.nextLine();
                }
            }else{
                System.out.println("Único número permitido: ");
                getEscritorio = sc.nextLine();
            }
        }
        f1.setCodEscritorio(getNumEscritorio);
        cadastro.add(f1);

        System.out.println("Cadastro realizado com sucesso.");

    }

    public void listarFuncionario(){
        System.out.println("Total: " + this.cadastro.size());
        for(int i = 0; i < this.cadastro.size(); i++){
            System.out.println("Código: " + (i + 1) + " - " + this.cadastro.get(i).getNome() + " " + this.cadastro.get(i).getSobrenome() + " " + this.cadastro.get(i).getIdade());
        }
    }

    public void excluirFuncionario(){
        // Nome
        System.out.println("Digite o nome do funcionário: ");
        String getNome = sc.nextLine();
        while(true){
            if(getNome.isEmpty()){
                printObrigatorio("Nome");
                getNome = sc.nextLine();
            }else {
                break;
            }
        }

        // Sobrenome
        System.out.println("Digite o sobrenome do funcionário: ");
        String getSobrenome = sc.nextLine();
        while(true){
            if(getSobrenome.isEmpty()){
                printObrigatorio("Sobrenome");
                getSobrenome = sc.nextLine();
            }else {
                break;
            }
        }

        Integer cod_funcionario = 0;
        Integer encontrado = 0;
        for(int i = 0; i < this.cadastro.size(); i++){
            if(getNome.contains(this.cadastro.get(i).getNome()) && getSobrenome.contains(this.cadastro.get(i).getSobrenome())){
                cod_funcionario = i;
                System.out.println("Tem certeza que deseja excluir o funcionário (" + this.cadastro.get(i).getNome() + " " + this.cadastro.get(i).getSobrenome() + ") de sua lista?");
                encontrado = 1;
                break;
            }
        }
        if(encontrado == 1){
            String getConfExcluir = sc.nextLine();
            if(getConfExcluir.contains("S") || getConfExcluir.contains("s")){
                System.out.println("Chamou??? " + cod_funcionario);
                this.cadastro.remove(cod_funcionario);
            }
        }else{
            System.out.println("Não foi possivel de localizar nome e sobrenome, por favor tente novamente? (Digita S ou Sim)");
            String getRepetir = sc.nextLine();
            if(getRepetir.contains("S") || getRepetir.contains("s")){
                excluirFuncionario();
            }
        }
    }

    public void printObrigatorio(String campoObrigatorio){
        System.out.print("O campo " + campoObrigatorio + " é de preenchimento obrigatório: ");
    }

    private static boolean validarTelefone(String telefone) {
        // Ex.: 37131826 ou 991712297
        if (telefone.matches("^[0-9]{8,9}$")) { // Telefone, Celular
            return true;
        // Ex.: 3713-1826 ou 99171-2297
        } else if(telefone.matches("\\s*\\d{4,5}\\-?\\d{4}$")){
            return true;
        } else {
            return false;
        }
    }

}

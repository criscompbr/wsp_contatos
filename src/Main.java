import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Funcionario f1 = new Funcionario();
        f1.inicializar();
        telaMenu();
        opcao=sc.nextInt();
        while(opcao!=0){
            switch(opcao){
                case 1:
                    f1.cadastrarFuncionario();
                    break;
                case 2:
                    System.out.println("-------");
                    break;
                case 3:
                    f1.listarFuncionario();
                    break;
                case 4:
                    f1.excluirFuncionario();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            telaMenu();
            opcao=sc.nextInt();
        }
    }

    public static void telaMenu(){
        limparTela();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("1 - Para cadastrar");
        System.out.println("2 - Para buscar");
        System.out.println("3 - Para listar");
        System.out.println("4 - Para excluir");
        System.out.println(" ");
        System.out.println("0 - Sair no sistema");
        System.out.println("----------------------------------------------------------------------------------------------");
        //System.out.println("***Cadastro Cliente Funcionário Curso Squadra***\n");
        //System.out.println(" Digite 1 para cadastrar Funcionário ou Cliente
        // \n Digite 2 pesquisar por um Funcionário ou Cliente
        // \n Digite 3 para excluir \n Digite 0 para sair");
    }

    public static void telaCadastrar(){
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cargo");
        System.out.println("3 - Escritório");
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

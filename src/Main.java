import java.util.Date;
import java.util.Scanner;
//@author: WILLYAN WALKER | TODOS OS DIREITOS RESERVADOS
public class Main {

    public static void main(String[] args) {
        //CLASSE PESSOA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o e-mail: ");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String nascimento = scanner.nextLine();
        System.out.println("Digite o RG: ");
        String rg = scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        
        Pessoa pessoa = new Pessoa(nome, email, telefone, nascimento, rg, cpf);
        
        System.out.println("Pessoa cadastrada:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("E-mail: " + pessoa.getEmail());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Nascimento: " + pessoa.getNascimento());
        System.out.println("RG: " + pessoa.getRg());
        System.out.println("CPF: " + pessoa.getCpf());

        //CLASSE ENDEREÇO
        System.out.print("Digite o logradouro: ");
        String logradouro = scanner.nextLine();
        
        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();
        
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("Digite o país: ");
        String pais = scanner.nextLine();
        
        Endereco endereco = new Endereco(logradouro, bairro, cidade, estado, pais);
        
        System.out.println("Endereço cadastrado:");
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
        System.out.println("País: " + endereco.getPais());
        
        //CLASSE BAGAGEM
        System.out.print("Tipo da bagagem: ");
        String tipo = scanner.nextLine();
        
        System.out.print("Peso da bagagem: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Bilhete da bagagem: ");
        scanner.nextLine();
        String bilhete = scanner.nextLine();
        
        // Criando uma nova bagagem com os dados lidos
        Bagagem minhaBagagem = new Bagagem(tipo, peso, bilhete);
        
        // Exibindo as informações da bagagem criada
        System.out.println("\nBagagem criada:");
        System.out.println("Tipo: " + minhaBagagem.getTipo());
        System.out.println("Peso: " + minhaBagagem.getPeso());
        System.out.println("Bilhete: " + minhaBagagem.getBilhete());

        //CLASSE PASSAGEIRO
        System.out.println("Informe o número do passaporte: ");
        String passaporte = scanner.nextLine();
        Passageiro passageiro = new Passageiro(passaporte);
        System.out.println("Número do passaporte informado: " + passageiro.getPassaporte());

        //CLASSE FUNCIONARIO
      
        // Solicita que o usuário informe o número da conta corrente
        System.out.print("Informe o número da conta corrente: ");
        int numeroContaCorrente = scanner.nextInt();

        // Cria um objeto da classe Funcionario com o número da conta informado
        Funcionario funcionario = new Funcionario(numeroContaCorrente);

        // Gera um valor aleatório para a conta corrente (apenas para demonstração)
        double valorContaCorrente = Math.random() * 10000;

        // Exibe o valor da conta corrente do funcionário
        System.out.printf("O funcionário de conta corrente %d tem R$ %.2f na sua conta.\n", funcionario.getContaCorrente(), valorContaCorrente);
      
        //CLASSE BILHETE
        System.out.println("Escolha um assento para o passageiro " + passageiro.getNome() + ":");
        
        //CLASSE HORARIO
        Date dataPartida = new Date();
        Date dataChegada = new Date();
        Date dataVoo = new Date();

        Horario horario = new Horario(dataPartida, dataChegada, dataVoo);
        horario.mostrarHorario();



        scanner.close();
    }
}
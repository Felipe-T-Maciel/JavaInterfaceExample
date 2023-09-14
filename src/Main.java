import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static GalaxyDB crudGalaxy = new GalaxyDB();
    static ComponenteDB crudComponente = new ComponenteDB();
    public static void main(String[] args) {
        int opcao = 0;

        do{
            System.out.println("""
                    
                    --- Bem vindo ---
                    
                    O que deseja cadastrar?
                    
                    [1] Menu de opções das Galaxias
                    [2] Menu de opções dos Componentes interestelares
                    [3] Logout
                    """);
            System.out.print("> ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> {
                    menuGalaxiaICRUD();
                }
                case 2 -> {
                    menuComponenteCRUD();
                }
                case 3 -> {
                    System.out.println("Desligando os componentes da nave...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção invalida");
                }
            }
        }while (opcao!=3);
    }

    private static void menuGalaxiaICRUD() {
        int opcao = 0;
        do{
            System.out.println(Galaxia.menuOpcaoGalaxia());
            opcao = sc.nextInt();

            switch (opcao){
                case 1-> {
                    crudGalaxy.create(cadastroGalaxia());
                }
                case 2 -> {
                    System.out.print("O id da galaxia que deseja remover: ");
                    int id = sc.nextInt();
                    crudGalaxy.delete(id);
                }
                case 3 -> {
                    System.out.print("O id da galaxia que deseja atualizar: ");
                    int id = sc.nextInt();
                    crudGalaxy.update(id, cadastroGalaxia());
                }
                case 4 -> {
                    System.out.print("O id da galaxia que deseja ver: ");
                    int id = sc.nextInt();
                    System.out.println(crudGalaxy.read(id));
                }
                case 5 -> {
                    crudGalaxy.readAll();
                }
            }
        }while (opcao>=1 && opcao<=5);
    }

    private static Galaxia cadastroGalaxia() {
        int opcao = 0;
        System.out.print(Galaxia.tipoGalaxia());
        opcao = sc.nextInt();
        System.out.print("" +
                "Nome da galaxia: ");
        String nome = sc.next();
        System.out.print("" +
                "Numero de estrelas: ");
        int qtdEstrelas = sc.nextInt();

        switch (opcao){
            case 1 -> {
                System.out.print("Valor do eixo maior: ");
                double eixoMaior = sc.nextDouble();
                System.out.print("Valor do eixo menor: ");
                double eixoMenor = sc.nextDouble();
                return new GalaxiaElipsoide(nome,qtdEstrelas,eixoMaior,eixoMenor);
            }
            case 2 -> {
                System.out.print("Valor do raio braço espiral: ");
                double bracoEspiral = sc.nextDouble();
                System.out.print("Quantidade de braços: ");
                int qtdBraco = sc.nextInt();
                return new GalaxiaElipsoide(nome,qtdEstrelas,bracoEspiral,qtdBraco);
            }
            case 3 -> {
                System.out.print("""
                        
                        A galaxia possui um nucleo?
                           [1] Sim     [0] Não""");
                int possuiNucleoSimNao = sc.nextInt();
                boolean possuiNucleo = possuiNucleoSimNao == 1;
                System.out.print("""
                        
                        A galaxia possui Materia Escura?
                           [1] Sim     [0] Não""");
                int possuimateriaEscuraSimNao = sc.nextInt();
                boolean possuimateriaEscura = possuimateriaEscuraSimNao == 1;
                return new GalaxiaIrregular(nome,qtdEstrelas,possuiNucleo,possuimateriaEscura);
            }
        }
        return null;
    }

    private static void menuComponenteCRUD() {
        int opcao = 0;
        do{
            System.out.println(Componente.menuOpcaoComponente());
            opcao = sc.nextInt();

            switch (opcao){
                case 1-> {
                    crudComponente.create(cadastroComponente());
                }
                case 2 -> {
                    System.out.print("O id do componente que deseja remover: ");
                    int id = sc.nextInt();
                    crudComponente.delete(id);
                }
                case 3 -> {
                    System.out.print("O id do componente que deseja atualizar: ");
                    int id = sc.nextInt();
                    crudComponente.update(id, cadastroComponente());
                }
                case 4 -> {
                    System.out.print("O id do componente que deseja ver: ");
                    int id = sc.nextInt();
                    System.out.println(crudComponente.read(id));
                }
                case 5 -> {
                    crudComponente.readAll();
                }
            }
        }while (opcao>=1 && opcao<=5);
    }

    private static Componente cadastroComponente() {
        int opcao = 0;
        System.out.print(Componente.tipoComponente());
        opcao = sc.nextInt();
        System.out.print("" +
                "Nome do Componente: ");
        String nome = sc.next();
        System.out.println("""
                        
                        O componente é original?
                          [1] Sim     [0] Não""");
        System.out.print("> ");
        int originalSimNao = sc.nextInt();
        boolean original = originalSimNao == 1;
        System.out.println(
                "Onde o componente foi fabricado: " +
                "Exemplo: No planeta Coruscant onde foi feita por um Rakata");
        System.out.print("> ");
        String lugarFabricacao;
        lugarFabricacao = sc.nextLine();
        sc.nextLine();

        switch (opcao){
            case 1 -> {
                System.out.print("A quantos gruas o leme gira: ");
                double grausMaxima = sc.nextDouble();
                System.out.print("Quantos pilotos o cockpit suporta: ");
                int qtdCapacidadePiloto = sc.nextInt();
                return new Cockpit(nome, original, lugarFabricacao, grausMaxima, qtdCapacidadePiloto);
            }
            case 2 -> {
                System.out.print("Qual a capacidade de litros para o combustivel: ");
                double capacidadeL = sc.nextDouble();
                System.out.print("Qual a velocidade de propulsão: ");
                double vlPropulsao = sc.nextDouble();
                return new Foguete(nome, original, lugarFabricacao, capacidadeL, vlPropulsao);
            }
            case 3 -> {
                System.out.print("A quantos gruas o leme gira: ");
                double grausMaxima = sc.nextDouble();
                System.out.print("Qual o tamanho da asa em metros: ");
                double tamanhoAsa = sc.nextDouble();
                return new Asa(nome, original, lugarFabricacao, grausMaxima, tamanhoAsa);
            }
        }
        return null;
    }
}

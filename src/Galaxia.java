public class Galaxia {
    private String nome;
    private int numeroDeEstrelas;

    public Galaxia(String nome, int numeroDeEstrelas) {
        this.nome = nome;
        this.numeroDeEstrelas = numeroDeEstrelas;
    }

    public static String tipoGalaxia() {
        return """
                Qual o tipo da nova galaxia?
                
                [1] Galaxia Elipsoide
                [2] Galaxia Espiral
                [3] Galaxia Irregular
                > """;
    }

    public static String menuOpcaoGalaxia(){
        return """
                    
                    [1] Adicionar uma nova Galaxia                  
                    [2] Remover uma Galaxia
                    [3] Atualizar uma Galaxia
                    [4] Ver uma galaxia especifica
                    [5] Ver todas as Galaxias
                    > """;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeEstrelas() {
        return numeroDeEstrelas;
    }
}

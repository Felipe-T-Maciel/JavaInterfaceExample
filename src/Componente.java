import java.util.ArrayList;

public class Componente {
    private String nome;
    private boolean original;
    private String lugarFabricação;

    public Componente(String nome, boolean original, String lugarFabricação) {
        this.nome = nome;
        this.original = original;
        this.lugarFabricação = lugarFabricação;
    }

    public static String tipoComponente(){
        return """
                Qual o tipo do novo Componente da nave?
                
                [1] Foguete
                [2] Cockpit
                [3] Asa
                > """;
    }

    public static String menuOpcaoComponente(){
        return """
                    
                    [1] Adicionar um novo Componente                  
                    [2] Remover um Componente
                    [3] Atualizar um Componente
                    [4] Listar um Componente especifico
                    [5] Listar todos os Componente da nave
                    > """;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "nome='" +  + '\'' +
                ", original=" + original +
                ", lugarFabricação='" + lugarFabricação + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getLugarFabricação() {
        return lugarFabricação;
    }

    public Boolean getOriginal() {
        return original;
    }
}

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
        return "";
    }
}

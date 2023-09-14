import java.util.ArrayList;

public class GalaxyDB implements ICrud<Integer, Galaxia>{
    private final ArrayList<Galaxia> galaxias = new ArrayList<>();

    @Override
    public Galaxia create(Galaxia object) {
        if (galaxias.add(object)){
            return object;
        }
        return null;
    }

    @Override
    public void delete(int ID) {
        if(ID < galaxias.size()){
            galaxias.remove(ID);
        }
    }

    @Override
    public void update(int ID, Galaxia object) {
        if(ID < galaxias.size()){
            galaxias.set(ID, object);
        }
    }

    @Override
    public Galaxia read(int ID) {
        if(ID < galaxias.size()){
            return galaxias.get(ID);
        }
        return null;
    }

    @Override
    public void readAll() {
        System.out.println("Galaxias atualmente conhecidas:\n");
        for (Galaxia galax:
             galaxias) {
            System.out.println("       ID: "+galaxias.indexOf(galax)+" | "+galax.toString());
        }
    }
}

import java.util.ArrayList;

public class ComponenteDB implements ICrud<Integer, Componente>{
    private final ArrayList<Componente> hardwares = new ArrayList<>();


    @Override
    public Componente create(Componente object) {
        if (hardwares.add(object)){
            return object;
        }
        return null;
    }

    @Override
    public void delete(int ID) {
        if(ID < hardwares.size()){
            hardwares.remove(ID);
        }
    }

    @Override
    public void update(int ID, Componente object) {
        if(ID < hardwares.size()){
            hardwares.set(ID, object);
        }
    }

    @Override
    public Componente read(int ID) {
        if(ID < hardwares.size()){
            return hardwares.get(ID);
        }
        return null;
    }

    @Override
    public void readAll() {
        System.out.println("Galaxias atualmente conhecidas:\n");
        for (Componente hardware:
                hardwares) {
            System.out.println("       ID: "+hardwares.indexOf(hardware)+" | "+hardware.toString());
        }
    }
}

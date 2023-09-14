import java.util.ArrayList;

public class ComponenteDB implements ICrud<Integer, Componente>{
    private final ArrayList<Componente> componentes = new ArrayList<>();


    @Override
    public Componente create(Componente object) {
        if (componentes.add(object)){
            return object;
        }
        return null;
    }

    @Override
    public void delete(int ID) {
        if(ID < componentes.size()){
            componentes.remove(ID);
        }
    }

    @Override
    public void update(int ID, Componente object) {
        if(ID < componentes.size()){
            componentes.set(ID, object);
        }
    }

    @Override
    public Componente read(int ID) {
        if(ID < componentes.size()){
            return componentes.get(ID);
        }
        return null;
    }

    @Override
    public void readAll() {
        System.out.println("Componentes presentes na nave:\n");
        for (Componente componente:
                componentes) {
            System.out.println("       ID: "+componentes.indexOf(componente)+" | "+componente.toString());
        }
    }
}

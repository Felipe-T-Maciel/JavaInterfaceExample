import java.util.ArrayList;

public interface ICrud<ID, T> {

    T create(T object);
    void delete(int ID);
    void update(int ID, T object);
    T read(int ID);
    void readAll();
}

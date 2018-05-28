import java.util.LinkedList;

class animal {
    String name;
    int time;
    public animal(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String getname() {
        return this.name;
    }
    public int gettime() {
        return this.time;
    }
}
public class AnimalShelter {
    private static final int dog = 1;
    private static final int cat = 0;
    private int tot;
    private LinkedList<animal> cats, dogs;
}

package pengjf.softwaretest;

/**
 * Created by Pengjf on 2020/8/17
 */
public class People {
    private final int    id;
    private final String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

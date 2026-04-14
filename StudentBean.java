import java.io.Serializable;

public class StudentBean implements Serializable {
    private int id;
    private String name;

    public StudentBean() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
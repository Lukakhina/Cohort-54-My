package homework41.task_3;

public class People3 {
    private String name;
    private int ege;
    private String citi;

    public People3(String name, int ege, String citi) {
        this.name = name;
        this.ege = ege;
        this.citi = citi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public String getCiti() {
        return citi;
    }

    public void setCiti(String citi) {
        this.citi = citi;
    }

    @Override
    public String toString() {
        return "People3{" +
                "name='" + name + '\'' +
                ", ege=" + ege +
                ", citi='" + citi + '\'' +
                '}';
    }
}

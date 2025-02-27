package leson41;

public class Cat {
    private String name;
    private int weidht;
    private String color;

    public Cat(String name, int weidht, String color) {
        this.name = name;
        this.weidht = weidht;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weidht=" + weidht +
                ", color='" + color + '\'' +
                '}';
    }
}

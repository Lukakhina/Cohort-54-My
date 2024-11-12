package leson17;

public class Cat {
    private String name;
    int age;
    protected int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void  seyMeow(){
        System.out.println(" Cat says meow");
        test();

    }
    private void test() {
        System.out.println("Test");
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight: " + weight;
    }
    protected void testProtected() {
        System.out.println("Cat protected");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
}

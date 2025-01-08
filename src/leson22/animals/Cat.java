package leson22.animals;


public class Cat extends Animal {
    //Переопределить родительский voice (изменить реализацию родительского метода)

    @Override//указывает, что я переопределяю родительский метод
    public void voice() {
        System.out.println("Cat sey meow!");
    }
    //  Уникальный функционал кота
    public void eat(){
        System.out.println("cat is eating");
    }
    // Перегрузка метода - статический полиморфизм
    public void eat(String food) {
        System.out.println("Cat is eating" + food);
    }


}

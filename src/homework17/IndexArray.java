package homework17;
/*
Написать метод int lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.
Написать метод int[] toArray() возвращающий все значения в виде обычного массива
 */

public class IndexArray {
     String name;
     int age;
     String profession;
     int wages;


    public IndexArray(int wages, String profession, int age, String name) {
        this.wages = wages;
        this.profession = profession;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }
}



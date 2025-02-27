package homework41.task_3;
/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        filterByAgeAndCiti();
    }

    private static void filterByAgeAndCiti() {
        List<People3> people = List.of(

         new People3("Jennifer",45,"Hamburg"),
         new People3("Patricia",25,"Munich"),
         new People3("Mary",35,"Berlin"),
         new People3("Linda",28,"Hamburg"),
         new People3("Elizabeth",25, "Frankfurt"),
         new People3("James", 38, "Frankfurt"),
         new People3("Michael",56,"Frankfurt"),
         new People3("David",45,"Stuttgart"),
         new People3("Richard",26, "Stuttgart"),
         new People3("William",38,"Hamburg")
         );

        int upToAge = 35;
        String city = "Frankfurt";

        List<People3> filteredPeople = people.stream()
                .filter(person -> person.getEge() > upToAge && person.getCiti().equals(city))
                .collect(Collectors.toList());

        System.out.println(filteredPeople);

    }
}

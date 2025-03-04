package homework42.Task4_1;
/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.

Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().

Подсказка:
Используйте Optional.of(user) или Optional.empty().
 */

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<User> users = List.of(
                       new User( 1, "Анна"),
                       new User( 2, "Борис"),
                       new User( 3, "Полина"),
                       new User( 4, "Алина"),
                       new User( 5, "Роман"),
                       new User( 6, "Катерина")
//   Optional<String> shortestString = text1.stream()
//                        .min(Comparator.comparing(String :: length));
//        System.out.println("минимальное значение" + shortestString);


        );
        Optional<User> user = findUserById(users, 3);
        user.ifPresent(user1 -> System.out.println(user1.getName()));

    }
    public static Optional<User> findUserById (List<User> users,int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();


    }
}

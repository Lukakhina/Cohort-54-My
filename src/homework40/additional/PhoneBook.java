package homework40.additional;
/*
Задача 2: Телефонная книга
Создайте класс PhoneBook, который использует Map для хранения имен и номеров телефонов.
 Реализуйте методы для добавления, удаления и поиска номеров по имени.
 */

import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    // Метод для добавления номера телефона
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    // Метод для удаления номера телефона
    public void removeContact(String name) {
        contacts.remove(name);
    }

    // Метод для поиска номера телефона по имени
    public String findPhoneNumberByName(String name) {
        return contacts.get(name);
    }

    // Демонстрация использования PhoneBook
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление контактов
        phoneBook.addContact("Владимир", "+38_098_025_422_12");
        phoneBook.addContact("Ольга", "+38_098_678_990_02");
        phoneBook.addContact("Михаил", "+38_098_259_892_32");
        phoneBook.addContact("Анна", "+38_098_322_589_62");
        phoneBook.addContact("Наталья", "+38_098_325_565_54");
        phoneBook.addContact("Роман", "+38_098_226_685_55");
        phoneBook.addContact("Анастасия", "+38_098_255_962_25");
        phoneBook.addContact("Антон", "+38_098_225_866_33");

        // Поиск номера телефона по имени
        System.out.println("Номер телефона Владимира: " + phoneBook.findPhoneNumberByName("Владимир"));
        System.out.println("Номер телефона Ольги: " + phoneBook.findPhoneNumberByName("Ольга"));

        // Удаление контакта
        phoneBook.removeContact("Антон");

        // Попытка найти удалённый контакт
        String antonPhoneNumber = phoneBook.findPhoneNumberByName("Антон");
        if (antonPhoneNumber == null) {
            System.out.println("Контакт Антон не найден.");
        } else {
            System.out.println("Номер телефона Антона: " + antonPhoneNumber);
        }
    }

}

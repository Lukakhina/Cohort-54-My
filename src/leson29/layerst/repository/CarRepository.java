
package leson29.layerst.repository;





/*
CRUD - операция
- Create (создание) - добавление новых данных (сущность)
- Read (Чтение) - получение млм чтение данных
- Update (Обновление) - изменение существующих данных
- Delete (Удаление) - удаление сущности (данных)
 */

import leson29.layerst.model.Car;
import leson29.layerst.utils.MyList;

public interface CarRepository {

    // Create - add
    Car addCar(String model, int year, double price);

    //READ
    // получить список всех машин
    MyList<Car> getAllCars();

    // получение сущности по id
    Car getById(int id);

    // Получить список только свободных машин
    
    // Получение списка машин по модели
    MyList<Car> getCarsByModel(String model);

    // Update
    // Обновление цены
    void updatePrice(int id, double newPrice);

    // Поменять статус машины
    void updateCarStatus(int id, boolean newStatus);

    // Delete
    void deleteById(int id);



}



















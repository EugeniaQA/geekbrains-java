# Введение в ООП

## Задание

1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

1. Конструктор класса должен заполнять эти поля при создании объекта.

1. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

1. Создать массив из 5 сотрудников.

    ```Java
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...); 
    ```

1. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

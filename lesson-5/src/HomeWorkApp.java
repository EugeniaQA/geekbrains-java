import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        Person[] personArray = new Person[] {
                new Person("Илья Малахов", "преподаватель", "i.malahov@gmail.com", "+7-923-777-88-99", 350000, 25),
                new Person("Прохор Кушнир", "наставник", "p.kushnir@gmail.com", "+7-923-777-88-00", 150000, 44),
                new Person("Кирилл Качалов", "бэкенд-разработчик", "k.kachalov@gmail.com", "+7-923-777-88-01", 190000, 26),
                new Person("Александр Храмович", "программист", "a.hramovich@gmail.com", "+7-923-777-88-02", 199000, 42),
                new Person("Юлия Зорина", "ассистент", "j.zorina@gmail.com", "+7-923-777-88-03", 70000, 35)
        };

        for (Person person : personArray) {
            if (person.getAge() > 40) {
                person.info();
            }
        }
    }
}


/**
 * Сотрудник
 */
public class Person {

    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phone, double salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Вывод информации в консоль
     */
    public void info() {
        System.out.println("ФИО: "+name+"; должность: "+position+"; email: "+email+"; телефон: "+phone+
                "; зарплата: "+salary+"; возраст: "+age+";");
    }

    /**
     * Возраст
     */
    public int getAge() {
        return age;
    }
}

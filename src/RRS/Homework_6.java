package RRS;

public class Homework_6 {
    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 6 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("""
                Условие:
                Необходимо создать класс Employee со следующими методами:\s
                getBaseSalary - получить базовую ставку
                setBaseSalary
                getName - получить имя
                setName
                getSalary - получить зарплату
                """);

        class Person{
            String name;
            int age;
            void displayInfoPerson(){
                System.out.printf("Name: %s \tAge: %d\n", name, age);
            }
        }

        Person tom = new Person();
        tom.displayInfoPerson();

        tom.name = "Tom";
        tom.age = 18;
        tom.displayInfoPerson();
    }
}

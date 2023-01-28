import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Андрей","Афоньев", 28));
        persons.add(new Person("Миша","Золотухин", 15));
        persons.add(new Person("Коля","Пупкин", 20));
        persons.add(new Person("Витя","Выкрутинский", 27));
        persons.add(new Person("Саша","Петров", 37));
        persons.add(new Person("Олег", "Петросян", 10));

        System.out.println(persons);
        Collections.sort(persons, new PersonComorator(8));
        System.out.println(persons);

        persons.removeIf(p -> (p.getAge() < 18));
        System.out.println(persons);
    }
}
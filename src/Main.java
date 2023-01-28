import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Андрей","Афоньев", 28));
        persons.add(new Person("Миша","Золотухин", 15));
        persons.add(new Person("Коля","Пупкин", 20));
        persons.add(new Person("Витя","Выкрутинский", 27));
        persons.add(new Person("Саша","Петров", 37));

        System.out.println(persons);
        Collections.sort(persons, new PersonComorator(7));
        System.out.println(persons);
    }
}
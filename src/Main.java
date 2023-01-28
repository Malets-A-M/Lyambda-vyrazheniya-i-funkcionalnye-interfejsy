import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Андрей","Афоньев", 28));
        persons.add(new Person("Миша","Золотухин", 15));
        persons.add(new Person("Коля","Пупкин", 20));
        persons.add(new Person("Витя","Выкрутинский", 27));
        persons.add(new Person("Саша","Петров", 37));

        System.out.println(persons);

        Comparator<Person> personComparator;
        personComparator = (Person o1, Person o2) -> {
            if (o1.getSurname().length() < o2.getSurname().length() && o1.getSurname().length() < 8){
                return 1;
            } else if (o1.getSurname().length() > o2.getSurname().length() && o1.getSurname().length() < 8){
                return -1;
            } else return Integer.compare(o2.getAge(), o1.getAge());
        };

        persons.sort(personComparator);
        System.out.println(persons);
    }
}
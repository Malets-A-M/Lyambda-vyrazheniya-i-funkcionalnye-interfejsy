import java.util.Comparator;

public class PersonComorator implements Comparator<Person> {
    int countLetters;
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() < o2.getSurname().length() && o1.getSurname().length() < countLetters){
            return 1;
        } else if (o1.getSurname().length() > o2.getSurname().length() && o1.getSurname().length() < countLetters){
            return -1;
        } else return Integer.compare(o2.getAge(), o1.getAge());
    }

    public PersonComorator(int countLetters){
        this.countLetters = countLetters;
    }
}

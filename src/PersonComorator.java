import java.util.Comparator;

public class PersonComorator implements Comparator<Person> {
    int countLetters;
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() < o2.getSurname().length() && o1.getSurname().length() < 8){
            return 1;
        } else if (o1.getSurname().length() > o2.getSurname().length() && o1.getSurname().length() < 8){
            return -1;
        } else if (o1.getAge() < o2.getAge()){
            return 1;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public PersonComorator(int countLetters){
        this.countLetters = countLetters;
    }
}

import java.util.Comparator;

public class AgeSortComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getAge() - o2.getAge(); //kan godt bruge primitive datatyper. Kan compareTo også.
        //Det var arraylisten der gjorde man ikke kunne bruge primitive

        //man kan lave if statements og alle mulige ting i compare metoden 

    }
}

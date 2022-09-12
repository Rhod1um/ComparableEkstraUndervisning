import java.util.Comparator;

public class BrandSortComparator implements Comparator<Car> {

    //hold mus over Comparator øverst og klik implement method i pop-uppen

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
        //compareTo her i method body ligger i String objektet
    }
}

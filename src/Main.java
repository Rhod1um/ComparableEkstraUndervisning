import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //comparable kan kun forholde sig til natural order, så én måde at sortere på
        //der er kun en ting man kan sortere baseret på, fornavn, brand, hvad man nu definere det som

        //Comparator kan sortere på forskellige ting og man skal lave en ny klasse for hver ting man vil sortere

        Car car1 = new Car("Tesla", "M1", FuelType.ELECTRIC, 12);
        Car car2 = new Car("Royota", "Rygo", FuelType.OIL,11);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        Car[] cars2 = new Car[2];
        cars2[0]= car1;
        cars2[1]= car2;

        System.out.println(Arrays.toString(cars2));

        Arrays.sort(cars2); //der er en sort metode i både Arrays klassen og Collections klassen. De gør det
        //samme men har intet med hinanden at gøre. Begge kender til compareTo metoden som arves fra Comparable
        //og derfor bruger de den "indirekte"
        //Collections.sort(cars2); //kan ikke bruge collections med array kun arraylist

        //checked java kalder selv, rød linje under kode, compiler finder den
        //unchecked, runtime

        System.out.println(Arrays.toString(cars2));
        System.out.println();

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);
        System.out.println();

        System.out.println(cars);

        Collections.sort(cars, new BrandSortComparator());

        System.out.println(cars);
        System.out.println();

        //datatype og accessmodifyer, og primitive og ikke-primitive datatyper er termer
        //der giver gode point at sige til eksamen

        //for each
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println();

        System.out.println(cars);

        Collections.sort(cars, new AgeSortComparator());
        System.out.println(cars);
    }
}

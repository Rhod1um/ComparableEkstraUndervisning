public class Car implements Comparable<Car>{
    private String model;
    private String brand;
    private FuelType fuel;
    private int age;
    private Integer age2; //Integer er en klasse, det er en ikke-primitiv datatype som indeholder en int

    Car(String model, String brand, FuelType fuel, int age){
        this.model=model;
        this.brand=brand;
        this.fuel=fuel;
        this.age=age;
    }

    @Override //comparable sammenligner natural order men comparator kan sammenligne alt muligt
    public int compareTo(Car o) {
        return model.compareTo(o.model);
        //return age.compareTo(o.age); //arraylisten ikke med int, kan kun tage objekter, så fx int skal være Integer
        //compareTo kan godt bruge primitive, det var arraylisten der var problemet
    } //-1 = større værdi end den den tjekker på
    //1 er mindre end og 0 er den samme


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", age=" + age +
                '}';
    }

    public String getBrand(){
        return brand;
    }
    public int getAge(){
        return age;
    }

}

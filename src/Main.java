public class Main {
    public static void main(String[] args) {
    Animal cat = new Animal("Cat");
    cat.name = "Tomek";

    //before feeding
    System.out.println(cat.weight);
    cat.Feed();
    //after feeding
    System.out.println(cat.weight);

    //taking for a walk until weight = 0
    for(int i = 30; i >0 ; i--) {
        cat.takeForAWalk();
    }
    System.out.println(cat.weight);

    //creating a new Human object, assigning previously created cat to the human
Human me = new Human();
me.firstName="Patrick";
me.lastName="Jankiewicz";
me.pet = cat;

Car car = new Car("Skoda","Octavia");
me.car = car;
me.car.YearOfProduction = 2009;
me.car.weight = 5000;








    }
}
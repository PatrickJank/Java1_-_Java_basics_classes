public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
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













    }
}
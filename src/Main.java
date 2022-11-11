import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Animal cat = new Animal("Cat");
        //cat.name = "Tomek";

        //before feeding
        System.out.println(cat.weight);
        cat.Feed();
        //after feeding
        System.out.println(cat.weight);

        //taking for a walk until weight = 0, uncomment to trigger
        /*
    for(int i = 30; i >0 ; i--) {
        cat.takeForAWalk();
    }
    System.out.println(cat.weight);
*/

        //creating a new Human object, assigning previously created cat to the human
        Human me = new Human();
        me.firstName = "Patrick";
        me.lastName = "Jankiewicz";
        me.pet = cat;



        System.out.println("Your current salary is " + me.getSalary());
        Scanner decision = new Scanner(System.in);
        System.out.println("Are you sure you want to change your salary? (Y/N)");
        char x = decision.next().charAt(0);
        char Y = 'Y';
        if (x == Y)
        {
            System.out.println("Please enter your new salary. Use (0000,0) format");
                if (x < 0)
                    System.out.println("Please do not use negative values");
                else {
                    double newSalary = decision.nextDouble();
                    me.setSalary(newSalary);
                    System.out.println("Your new salary has been sent to the billing department, please remember to get a new anex from Mr. Hania");
                    System.out.println("By the way, ZUS and US already know about your new salary, no point in hiding it");
                }
            }

        Car auto = new Car(5000.0);
        System.out.println(me.getPet());
        System.out.println(me.getAuto());
        me.setAuto(5000.0, auto);
        ;



        }
    }

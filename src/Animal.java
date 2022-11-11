public class Animal {

    final String species;
    Double weight;

    String name;

    Boolean isAlive = true;
Animal(String x)
{
    this.isAlive = true;
    species = x;
    if(x == "dog" || x =="Dog")
        weight = 10.0;
    if(x == "cat" || x == "Cat")
        weight = 5.0;
    else
        weight = 2.0;
}

void Feed()
    {
        if(this.isAlive){
            this.weight += 0.1;
            System.out.println("Om nom nom");
    }
   if(!this.isAlive)
        System.out.println("He's dead, why are you doing this?");
    }
void takeForAWalk()
    {
        if(this.isAlive)
            this.weight -= 0.2;
        if(this.weight<= 0.0)
        {
            this.isAlive = false;
            this.weight = 0.0;
        }
        if(!this.isAlive)
        System.out.println("The police is on their way you sicko");
    }


}

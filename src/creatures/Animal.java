package creatures;

public abstract class Animal {

    final public String species;
    public Double weight;

    public String name;
public Human owner;
public Boolean isOwned;
    Boolean isAlive = true;
public Animal(String species, Double weight, String name)
{
    this.isAlive = true;
    this.isOwned = true;
    this.weight = weight;
    this.species = species;
}

public void Feed()
    {
        if(this.isAlive){
            this.weight += 0.1;
            System.out.println("Om nom nom");
    }
   if(!this.isAlive)
        System.out.println("He's dead, why are you doing this?");
    }
public void takeForAWalk()
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

    public String toStringP(){
    return (species + " " + weight + " " + name);
    }

    public Boolean isOwned() {
        return this.isOwned;
    }
}

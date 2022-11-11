import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//importing data libraries for the task 3/4.2
 public class Human {
    Animal pet;
    String firstName;
    String lastName;

    private Car auto;

    private Double salary = 4500.0;

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Information was generated on " + dtf.format(now));
        return (this.salary);
    }

    public Animal getPet()
    {
        return pet;
    }

    public Double setSalary(Double value) {
        this.salary = value;
        return value;
    }

    public Car getAuto()
    {
        return auto;
    }

    public void setAuto(Double Price, Car auto)
    {

    if (salary>= Price)
    {
        System.out.println("Car has been bought with cash");
        auto.IsAcquired = true;
    }
    else if ((salary> Price/12.0)&&(salary < Price))
    {
        System.out.println("Car has been purchased on credit");
        auto.IsAcquired = true;
    }
    else
        System.out.println("You do not have enough cash, try saving some or take a loan");
    }

}



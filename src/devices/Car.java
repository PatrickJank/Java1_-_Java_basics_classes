package devices;

public class Car {
 public String model = "Octavia";
 public String producer = "Skoda";
 public Double weight;
 public Integer YearOfProduction;
 public Boolean airConditioner;
 public Double price;
 public boolean IsAcquired = false;

 public Car(Double x)
 {
  this.model = model;
  this.producer = producer;
  this.IsAcquired=true;
  this.price = x;
 }
 public boolean check(Car object){
  return (this == object);
 }
 public String toStringC(){
  return (model + " " + producer + " " + price);
 }



 }






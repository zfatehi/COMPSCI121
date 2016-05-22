
public class Car
{
  private String make;
  private double fuelCapacity;
  private double fuelAmount;

  public Car(final String what, final double cap, final double amt)
  {
    make = what;
    fuelCapacity = cap;
    fuelAmount = amt;
  }

  public double getFuelAmount()
  {
    return fuelAmount;
  }

  public double getFuelCapacity()
  {
    return fuelCapacity;
  }

  public String getMake()
  {
    return make;
  }

  public void setFuelAmount(final double fuelAmount)
  {
    this.fuelAmount = fuelAmount;
  }

  public void setFuelCapacity(final double fuelCapacity)
  {
    this.fuelCapacity = fuelCapacity;
  }

  public void setMake(final String make)
  {
    this.make = make;
  }

  public double unusedCap()
  {
    return fuelCapacity - fuelAmount;
  }
}

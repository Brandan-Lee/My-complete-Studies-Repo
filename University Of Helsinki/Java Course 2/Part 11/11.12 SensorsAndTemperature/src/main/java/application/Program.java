
/*
All the classes should be placed inside the application package.

1. Standard sensor
Create a class called StandardSensor that implements the interface Sensor.

A standard sensor is always on. Calling the methods setOn and setOff have no 
effect. The StandardSensor must have a constructor that takes one integer 
parameter. The method call read returns the number that was given to the 
constructor.

2. TemperatureSensor
Create a class TemperatureSensor that implements the Sensor interface.

At first a temperature sensor is off. When the method read is called and the 
sensor is on, the sensor randomly chooses an integer in the range -30...30 and
returns it. If the sensor is off, the method read throws an 
IllegalStateException.

3. Average sensor
Create a class called AverageSensor that implements the interface Sensor.

An average sensor includes multiple sensors. In addition to the methods defined
in the Sensor interface, the AverageSensor has the method public void addSensor
(Sensor toAdd) that can be used to add a new sensor for the average sensor to 
control.

An AverageSensor is on when all its sensors are on. When setOn is called, all 
the sensors must be set on. When setOff is called, at least one of the sensors 
must be set off. It's also acceptable to set off all the sensors.

The method read of AverageSensor returns the average of the read methods of its
sensors (since the return value is int, the number is rounded down as is the 
case with integer division). If this method is called while the AverageSensor is
off, or if no sensors have been added to it, the method should throw an 
IllegalStateException.

4. All readings
Add to the class AverageSensor the method public List<Integer> readings(). The
method should return the results of all the executed readings that the average
sensor has done as a list. Here is an example:
 */
package application;

public class Program {

    public static void main(String[] args) {

//1        
//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());

//3
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

    }//end main

    /*
    Examples of output
    1
    10
    -5
    true
    true
    
    3
    temperature in Kumpula 5 degrees Celsius
    temperature in Helsinki region -23 degrees Celsius
     */
}//end class

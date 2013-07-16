/**
* OOP pada java
* contoh pengunaan OOP pada java
* membuat sebuah class kemudian membuat instance dari class tersebut
* 
*/

class Motorcycle { //class
  //variabel instance / atribute class Motorcycle
  String make, color;
  boolean engineState;
  
  void startEngine() { //method startEngine dari class Motorcycle (subroutine/procedure)
    if  (engineState)
      System.out.println("The engine is already on");
    else {
      engineState = true;
      System.out.println("The engine is now on");
    }
  }
  
  void showAtts() { //method showAtts dari class Motorcycle (subroutine/procedure)
    System.out.println("This motorcycle is a "+ color +" "+ make +".");
    if (engineState)
      System.out.println("The engine is on");
  }
  
  public static void main(String[]arg) {
    Motorcycle m = new Motorcyle(); //instance m dari class Motorcycle (object)
    m.make = "Yamaha RZ350"; //memasukkan nilai kedalam variabel intance sebagai atribut object m
    m.color = "yellow";
    System.out.println("calling showAtts....");
    m.showAtts(); //memanggil method showAtts pada object m
    System.out.println("Starting engine....");
    m.startEngine();
    System.out.println("calling showAtts....");
    m.showAtts(); //memanggil method showAtts pada object m
    System.out.println("Starting engine....");
    m.startEngine();
  }
}

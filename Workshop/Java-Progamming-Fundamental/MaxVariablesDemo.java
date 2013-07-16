public class MaxVariablesDemo {
  public ststic void main(String[]args) {
    //integers
    byte largestByte     = Byte.MAX_VALUE;
    short largestShort   = Short.MAX_VALUE;
    int largestInteger   = Integer.MAX_VALUE;
    long largestLong     = Long.MAX_VALUE;  
    //real numbers
    float largestFloat   = Float.MAX_VALUE; 
    double largestDouble = Double.MAX_VALUE;
    //other primitive types
    char aChar           = 'S';
    boolean aBoolean     = true;
    //display then all
    System.out.println("The Largest byte value is   = "+largestByte);
    System.out.println("The Largest short value is   = "+largestShort);
    System.out.println("The Largest integer value is   = "+largestInteger);
    System.out.println("The Largest long value is   = "+largestLong);
    System.out.println("The Largest float value is   = "+largestFloat);
    System.out.println("The Largest double value is   = "+largestDouble);
    if (Character.isUpperCase(aChar)) {
      System.out.println("The Character "+ aChar +" is upper case.");
    } else {
      System.out.println("The Character "+ aChar +" is lower case.");
    }
    System.out.println("The Value of aBoolean is "+ aBoolean);
  }
}

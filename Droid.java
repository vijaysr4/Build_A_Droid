
public class Droid {
  // object instance
  String name;
  int batteryLevel;
  //constructor method
  public Droid(String droidname) {
    name = droidname;
    batteryLevel = 100;
  }
  //string method
  public String toString() {
    return "Hello, I'm the droid: " + name;
  }
  //task method
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  //energy report method
  public void energyReport(int batteryLevel){
    System.out.println("Energy report: " + batteryLevel);
  }
  //main method 
  public static void main(String[] args) {
  //new instance of Droid
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("Processing");
    codey.energyReport(80);
  }
}


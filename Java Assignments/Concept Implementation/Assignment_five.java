interface Drivable {
    void startEngine();  
    void stopEngine();   
}

class Car implements Drivable {
    public void startEngine() {
        System.out.println("Engine started");
    }
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
class Assignment_five {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine(); 
        myCar.stopEngine();  
    }
}

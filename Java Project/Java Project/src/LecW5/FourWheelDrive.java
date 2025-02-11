package LecW5;

public class FourWheelDrive {
    // can be public cuz nvr specify anyt
    private int fuelLevel;
    private int speed;
    private boolean isFourWheelDrive;


    public void activateFourWheelDrive(){
        if (fuelLevel > 20){
            isFourWheelDrive = true;
            System.out.println("sufficient Fuel to activate 4 wheel drive");
        }
        else{
            System.out.println("insufficient Fuel to activate 4 wheel drive");
        }
    }
    public void deactivateFourWheelDrive(){
        isFourWheelDrive = false;
        System.out.println("4 wheel drive deactivated");
    }

    public void accelerate(int acceleration){
        this.speed += acceleration;
        System.out.println("Accelaration " +acceleration);
    }

    public void refuel(int fuel){
        this.fuelLevel += fuel;
        System.out.println("refueled amt" +fuel);
    }

    public void displayStatus(){
        System.out.println("Fuel" +fuelLevel);
        System.out.println("Speed" +speed);
        System.out.println("four wheel" +(isFourWheelDrive ? "Active":"Inactive"));
    }

    public FourWheelDrive(int fuelLevel, int speed,boolean isFourWheelDrive) {
        this.fuelLevel = fuelLevel;
        this.speed = speed;
        this.isFourWheelDrive = false;
    }

    public static void main (String[] args){

        FourWheelDrive newC = new FourWheelDrive(100,0,true);

        //display initial status
        newC.displayStatus();

        // activate 4 wheel
        newC.activateFourWheelDrive();

        // accelerate
        newC.accelerate(50);
        newC.displayStatus();

        newC.refuel(30);
        newC.displayStatus();


    }
}

public class Vehical {
    void drive() {
        System.out.println("Driving!!");
    }
    void vehicaleBreak() {
        System.out.println("Vehical Break!!");
    }
    void revers() {
        System.out.println("Reverse!!");
    }
}

    class car extends Vehical{
        void motoRacing(){
            System.out.println("Racing!!");
        }
    }
    class ModernCar extends  car {
        void flying() {
            System.out.println("Flyng!!");
        }
    }
    class Boat extends Vehical{
    void surf(){
        System.out.println("Surfing!!");
    }
    }

    class ModerBoat extends  Boat{
    void landRidding(){
        System.out.println("Ridding!!");
    }
    }
    class testOutput {
        public static void main(String[] args) {
          ModernCar mc = new ModernCar();
          ModerBoat mb =  new ModerBoat();
          mc.drive();
          mc.vehicaleBreak();
          mc.revers();
          mc.motoRacing();
          mc.flying();
          mb.surf();
          mb.landRidding();

        }
    }




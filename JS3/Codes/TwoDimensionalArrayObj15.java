class Example15 {
    String typeCar;
    String model;

    Example15(String typeCar, String model) {
        this.typeCar = typeCar;
        this.model = model;
    }

    void displayCar() {
        System.out.println("Type : "+typeCar+", Model : "+model);
    }
}

public class TwoDimensionalArrayObj15 {
    public static void main(String[] args) {
        Example15[][] carArray = new Example15[2][2];

        carArray[0][0] = new Example15("Chevy", "Corvette");
        carArray[0][1] = new Example15("Porsche", "911");

        System.out.println(carArray[0][0].model); //print Corvette model
        System.out.println(carArray[0][1].typeCar); //print Porsche typeCar
    }
}
public class Triangle15 {
    public int base;
    public int height;

    public Triangle15(int a, int t) {
        base = a;
        height = t;
    }

    public double countArea() {
        return 0.5*base*height; // 1/2 * alas * tinggi
    }

    public double countPerimeter() {
        double c = Math.sqrt(base*base + height*height); // c = akar (alas^2 + tinggi^2)
        return base+height+c; // a+b+c (a utk alas, b utk tinggi, c untuk sisi pling panjg)
    }

    public static void print(Triangle15[] trArray) {
        for (int i = 0; i < trArray.length; i++) {
            System.out.println("Triangle "+i+" : ");
            System.out.println("Base : "+trArray[i].base);
            System.out.println("Height : "+trArray[i].height);
            System.out.println("Area : "+trArray[i].countArea());
            System.out.println("Perimeter : "+trArray[i].countPerimeter());
        }
    }
}


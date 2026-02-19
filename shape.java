public class shape {
    void area(int a) {
        int area = a * a;
        System.out.println("Area of square: " + area);
    }
    void area(float a, float b) {
        float area = a * b;
        System.out.println("Area of rectangle: " + area);
    }
    void area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }
    void area(double r) {
        double area = Math.PI * r * r;
        System.out.println("Area of circle: " + area);
    }
    public static void main(String[] args) {
        shape s = new shape();
        s.area(5);
        s.area(4.5f, 3.2f);
        s.area(3.0f, 4.0f, 5.0f);
        s.area(2.5);
    }
}

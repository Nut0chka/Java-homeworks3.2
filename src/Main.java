public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double bmiIndex = service.calculate(weight, height);

        System.out.println(bmiIndex);
    }
}
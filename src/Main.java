public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65;
        int height = (int) Math.round(1.78);
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}

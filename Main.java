public class Main {
    public static void main(String[] args) {

        BmServices service = new BmServices();

        float bmi = service.calculate(65,160);

        System.out.println("Ваш индекс массы тела равен: " + bmi);

    }
}
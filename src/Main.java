public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("fdfdDF_gSSS", "07KBR", "07KBR");
        if (result) {
            System.out.println("Корректные данные!");
        }
    }
}
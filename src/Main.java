public class Main {
    public static String login; //= "java_skypro_go";
    public static String password; //= "D_1hWiKjjP_9";
    private static String confirmPassword;

    public static void main(String[] args) { // метод с login, password, confirmPassword
        Users user = new Users("Фjava_skypro_go1234567890123456789", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
//        String login; // = "java_skypro_go";
//        String password; // = "D_1hWiKjjP_9";
//        String confirmPassword;
        Service.workExceptions(login, password, confirmPassword);
    }


}
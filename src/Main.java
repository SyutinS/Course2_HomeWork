public class Main {

    public static void main(String[] args) { // метод с login, password, confirmPassword
        Users user = new Users("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        System.out.println(user);
        Service.workExceptions(Users.getLogin(), Users.getPassword(), Users.getConfirmPassword());
    }


}
public class Service {

    public static void workExceptions(String login, String password, String confirmPassword) {
        try {
            if (login == null || password == null || confirmPassword == null) {
                throw new NullPointerException();
            }
            if (!login.matches("[a-zA-Z0-9_]{1,19}")) { // неправильный логин
                throw new WrongLoginException();
            }
            if (!password.matches("[a-zA-Z0-9_]{1,20}")) { // неправильный пароль
                throw new WrongPasswordException();
            }
            if (!confirmPassword.equals(password)) { // пароли не совпадают
                throw new WrongPasswordException();
            }
        } catch (NullPointerException nullError) {
            System.out.println(" проверить все обязательные поля: login, password или confirmPassword, что то забыли ввести. ");
        } catch (WrongLoginException loginError) {
            System.out.println(" WrongLoginException ");
        } catch (WrongPasswordException passwordError) {
            System.out.println(" WrongPasswordException ");
        } finally {
            System.out.println(" Метод завершен ");
        }
    }
}

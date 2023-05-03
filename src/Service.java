import javax.management.BadStringOperationException;

public class Service {

    public static void workExceptions(String login, String password, String confirmPassword) {
        try {
            if (Users.getLogin().matches("a-zA-Z0-9") && Users.getLogin().length() > 20) { // неправильный логин
                throw new BadStringOperationException(login); // WrongLoginException(login)
            }

            if (Users.getPassword().matches("[a-zA-Z0-9]+_") && Users.getPassword().length() >= 20) { // неправильный пароль
                throw new RuntimeException(password); // WrongPasswordException
            }

            if (!Users.getConfirmPassword().equals(Users.getPassword())) { // пароли не совпадают
                throw new RuntimeException(confirmPassword); // WrongPasswordException
            }
        } catch (BadStringOperationException loginError) {
            System.out.println(Users.getLogin() + " логин не правильный ");
        }
        finally {
            System.out.println(" Все зашибись работает ");
        }
    }
}

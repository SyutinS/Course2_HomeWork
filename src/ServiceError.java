public class ServiceError {

    public static void workExceptions(String login, String password, String confirmPassword) throws
            WrongLoginErrorException, WrongLoginException, WrongPasswordErrorException, WrongPasswordException {
        if (login == null || password == null || confirmPassword == null) { // пусто где то
            throw new NullPointerException();
        }
        if (!login.matches("[a-zA-Z0-9_]+")) { // неправильный логин
            throw new WrongLoginErrorException("неправильный логин " + login);
        }
        if (login.length() >= 20) { // длинный логин
            throw new WrongLoginException(" длинный логин " + login);
        }
        if (!password.matches("[a-zA-Z0-9_]{1,20}")) { // неправильный пароль
            throw new WrongPasswordErrorException("неправильный пароль " + password);
        }
        if (!confirmPassword.equals(password)) { // пароли не совпадают
            throw new WrongPasswordException("пароли не совпадают " + confirmPassword);
        }
    }
}

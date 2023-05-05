public class Service {

    public static void workExceptions(String login, String password, String confirmPassword) {
        try {
            if (login == null || password == null || confirmPassword == null) {
                throw new NullPointerException();
            }
            if (!login.matches("[a-zA-Z0-9_]+")) { // неправильный логин
                throw new WrongLoginErrorException();
            }
            if (login.length() >= 20) {
                throw new WrongLoginException();
            }
            if (!password.matches("[a-zA-Z0-9_]{1,20}")) { // неправильный пароль
                throw new WrongPasswordErrorException();
            }
            if (!confirmPassword.equals(password)) { // пароли не совпадают
                throw new WrongPasswordException();
            }
        } catch (NullPointerException nullError) {
            System.out.println(" проверить все обязательные поля: login, password или confirmPassword, что то забыли ввести. ");
        } catch (WrongLoginErrorException loginEnterError) {
            System.out.println("' " + login + " ' логин введен с ошибками, необходимо исправить");
        } catch (WrongLoginException loginError) {
            System.out.println(" WrongLoginException ");
        } catch (WrongPasswordErrorException passwordError) {
            System.out.println("' " + password + " ' Пароль задан не верно ");
        } catch (WrongPasswordException passwordEqualsError) {
            System.out.println(" WrongPasswordException ");
        } finally {
            System.out.println(" Метод завершен ");
        }
    }
}

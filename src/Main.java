public class Main {

    public static void main(String[] args) {
        Users user = new Users("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        System.out.println(user);
        try {
            ServiceError.workExceptions(Users.getLogin(), Users.getPassword(), Users.getConfirmPassword());
        } catch (NullPointerException nullError) {
            System.out.println(" проверить все обязательные поля: login, password или confirmPassword, что то забыли ввести. ");
        } catch (WrongLoginErrorException loginError) {
            System.out.println("' " + loginError.getMessage() + " ' логин введен с ошибками, необходимо исправить");
        } catch (WrongLoginException loginError) {
            System.out.println(" WrongLoginException ");
        } catch (WrongPasswordErrorException passwordError) {
            System.out.println("' " + passwordError.getMessage() + " ' Пароль задан не верно ");
        } catch (WrongPasswordException passwordEqualsError) {
            System.out.println(" WrongPasswordException ");
        } finally {
            System.out.println("---------------------");
            System.out.println(" Метод завершен ");
        }
    }
}
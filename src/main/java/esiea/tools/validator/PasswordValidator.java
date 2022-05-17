package esiea.tools.validator;

public class PasswordValidator {
    public boolean validatePassword(String password) {
        String strRegEx = "^(?=.*[0-9]).{6,20}$";
        return password.matches(strRegEx);
    }
}

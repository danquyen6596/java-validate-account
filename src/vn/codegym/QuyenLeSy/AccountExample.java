package vn.codegym.QuyenLeSy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}

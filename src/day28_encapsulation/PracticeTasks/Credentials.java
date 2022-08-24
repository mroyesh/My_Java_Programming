package day28_encapsulation.PracticeTasks;

import Lab05_Recap.PrintEach;

public class Credentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassWord(password)){
            System.err.println("your password is weak");
            System.exit(1);
        }
        this.password = password;
    }
    public boolean isStrongPassWord(String password) {
        int countLetter = 0;
        int countSpeChar = 0;
        int countDigit = 0;
        if ( password.length() < 8 && !password.contains(" ") ) {
            for (int i = 0; i < password.length(); i++) {
                if ( Character.isLetter(password.charAt(i)) ) {
                    countLetter++;
                } else if ( !Character.isLetterOrDigit(password.charAt(i)) ) {
                    countSpeChar++;
                } else {
                    countDigit++;
                }

            }

        }
        if ( countDigit < 1 || countLetter < 1 || countSpeChar < 1 ) {
            return false;
        }
        return true;
    }
}
/*
Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
      2. PassWord should at least contain one letter
       3. Password should at least contain one special characters
       4. Password should at least contain a digit

                toString()

 */

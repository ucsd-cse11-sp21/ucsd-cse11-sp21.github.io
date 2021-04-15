/*
Create a class named SignUpForm representing a Sign Up form from a website.
 This class must contain two fields, username and password

Password must be at least 8 characters long.
Password must contain at least one number (0-9).
Password must contain at least one special character (!,#,$,*)
*/

class SignUpForm{
    String username;
    String password;

    SignUpForm(String username, String password){
        this.username = username;
        this.password = password;

    }

    String checkUsername(){

        if(this.username.length() == 0){
            return "invalid";

        }
        else{
            return "ok";
        }

    }

    String checkPassword(){
        if(this.password.length() < 8){
            return "password length must be at least 8 characters";
        }
        else if(!this.hasNumber(this.password)){
            return "Password must contain at least one number";

        }
        else if(!this.hasSpecialCharacter(this.password)){
            return "Password must contain at least one special characater";
        }
        else{
            return "ok";
        }

    }
//str = "abcd" str.contains("cd") --> true str.contains("ad") --> false
    boolean hasNumber(String str){
        return str.contains("0") || str.contains("1")|| str.contains("2")|| str.contains("3")|| str.contains("4")
        || str.contains("5")|| str.contains("6")|| str.contains("7")|| str.contains("8")|| str.contains("9");
    }
//!,#,$,*
    boolean hasSpecialCharacter(String str){
        return str.contains("!") || str.contains("#") || str.contains("$")|| str.contains("*");
    }





}

class ExampleForms{
    SignUpForm form = new SignUpForm("", "auron");

    String username = this.form.checkUsername();
    String passwd = this.form.checkPassword();

    boolean hasnum = this.form.hasNumber("awe12");
    boolean haschar = this.form.hasSpecialCharacter("asde");

}





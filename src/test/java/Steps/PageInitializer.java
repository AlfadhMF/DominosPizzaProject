package Steps;

import Pages.SignUpPage;

public class PageInitializer {

    public static SignUpPage signUpPage;


    public static void InitializePageObjects(){
        signUpPage = new SignUpPage();
    }
}

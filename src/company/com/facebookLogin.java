package company.com;

import org.testng.annotations.Test;

public class facebookLogin {
@Test
    void loginWithValidCredintials(){

        System.out.println("Hi, I Logged on Facebook page");
    }
    @Test
    void loginWithInValidCredintials(){

        System.out.println("Hi,I can't Logged on Facebook page");
    }
}

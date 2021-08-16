

public class BasePagee {
    private String pageLink;
    public BasePagee() {
        System.out.println("Base Page Created.");
    }
    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }
}

class LoginPage extends BasePagee {
    public LoginPage() {
        System.out.println("Login Page Created.");
    }
    public LoginPage(String pageLink) {
        setPageLink(pageLink);
    }
}

class Runnerr {
    public static void main(String[] args) {
        BasePagee basePage = new LoginPage();
    }
}
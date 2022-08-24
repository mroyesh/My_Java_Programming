package day31_inheritance.TaskSolutions.browserTask;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome browser");
    }

}

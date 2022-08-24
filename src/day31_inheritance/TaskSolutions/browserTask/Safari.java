package day31_inheritance.TaskSolutions.browserTask;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari browser");
    }
}

package day11_Stringpart2.PracticeTasks;

public class ValidWebsite2 {
    public static void main(String[] args) {
        String webSite= "www.sdccd.edu";
        String begins= webSite.substring(webSite.indexOf("W"));
        String ends= webSite.substring(webSite.indexOf(".com"));
        System.out.println(begins+ends);

    }
}

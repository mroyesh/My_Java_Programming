package day11_practice;

public class ValidWebsite2 {
    public static void main(String[] args) {
        String webSite= "www.sdccd.edu";
        String begins= webSite.substring(webSite.indexOf("W"));
        String ends= webSite.substring(webSite.indexOf(".com"));
        System.out.println(begins+ends);

    }
}

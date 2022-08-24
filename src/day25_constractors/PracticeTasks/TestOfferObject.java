package day25_constractors.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class TestOfferObject {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Washington State", "MicroSoft", "JavaDeveloper", 100000, true, true, false, true);
        Offer offer2 = new Offer("Utah", "Adobe", "System Engineer", 120000, false, false, false, false);
        Offer offer3 = new Offer("California", "Qualcomm", "JavaDeveloper", 110000, true, false, true, true);
        Offer offer4 = new Offer("California", "SDCCD", "JavaDeveloper", 90000, true, true, true, true);
        Offer offer5 = new Offer("California", "County of SD", "JavaDeveloper", 105000, true, false, true, false);
        Offer offer6 = new Offer("Montana", "NIO", "JavaDeveloper", 95000, false, false, false, true);
        Offer offer7 = new Offer("Montana", "Pioneer", "frontEnd developer", 98000, true, true, false, false);

        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        ArrayList<Offer> isFullTime = new ArrayList<>(offers);
        isFullTime.removeIf(p -> !p.ifFullTime);

        ArrayList<Offer> localOffer = new ArrayList<>(offers);
        localOffer.removeIf(p -> !p.Location.equals("California"));

        ArrayList<Offer> offersWithBenifits = new ArrayList<>(offers);
        offersWithBenifits.removeIf(p -> !p.hasBenefits && !p.hasPTO);

        ArrayList<Offer> devOffer = new ArrayList<>(offers);
        devOffer.removeIf(p -> !p.jobTitle.contains("Developer"));

        ArrayList<Offer>with100K= new ArrayList<>(offers);
        with100K.removeIf(p->p.salary<100000);



        System.out.println(isFullTime);
        System.out.println(localOffer);
        System.out.println(offersWithBenifits);
        System.out.println(devOffer);
        System.out.println(with100K);



    }
}

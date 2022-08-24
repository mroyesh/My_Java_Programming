package day30_inheritance.TaskSolutions.CryptoTask;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin firstAsset= new Bitcoin(20183, 20,393000000000l,23625256933l, 2348884, true );
        Ethereum secondAsset= new Ethereum(1097, 200, 1224000000000l,12400000, 1230000,true );
        Cardano thirdAsset= new Cardano(0.47, 12000 ,16426920580l, 1200000, 123444, false);
        XRP fourthAsset= new XRP(0.33, 16000, 1260000000, 19000000, 7000000, false);
        Doge fifthAsset= new Doge(0.07, 140000, 25000000000l, 240000000, 19000000, true);

        double finalAsset= firstAsset.totalPrice()+secondAsset.totalPrice()+thirdAsset.totalPrice()+fourthAsset.totalPrice()+fifthAsset.totalPrice();

        System.out.println(firstAsset);
        System.out.println(secondAsset);
        System.out.println(thirdAsset);
        System.out.println(fourthAsset);
        System.out.println(fifthAsset);
        System.out.println("My asset equals= $"+finalAsset);

    }
}

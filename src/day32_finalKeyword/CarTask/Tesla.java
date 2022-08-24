package day32_finalKeyword.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("Say \" Start\" to start"+getMake()+getModel());
    }
    public final void autoPilot(){
        System.out.println(getMake()+getModel()+ " is in self-driving mode");
    }

    @Override
    public void setModel(String model) {
        ArrayList<String>models= new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", " Model 3"));
       // String [] models = {"Model S", " Model Y","Model "};
        //if(! Arrays.asList(models).contains(model) ){
        if(!models.contains(model)){
            System.err.println("Invalid Tesla model"+ model);
            System.exit(1);
        }
        super.setModel(model);// this.model=model
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Black", "Red", " Silver", "Blue", " Brown", "Green"));
        if(! colors.contains(color)) {
            System.out.println("Invalid color" + color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {

    if(year<2008) {
        System.out.println("Invalid year of Tesla car: " + year);
        System.exit(1);
    }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
    if(price< 50000) {
        System.err.println("invalid price for Tesla car: " + price);
        System.exit(1);
    }
        super.setPrice(price);
    }
}

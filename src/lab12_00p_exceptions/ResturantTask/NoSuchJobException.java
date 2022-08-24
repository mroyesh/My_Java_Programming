package lab12_00p_exceptions.ResturantTask;

public class NoSuchJobException extends RuntimeException{

    public NoSuchJobException(String exceptionMessage) {

        super(exceptionMessage);  // displays to specify message as exception
    }

    /*public static void main(String[] args) {
       //throw  new RuntimeException("Something went wrong");

        throw new NoSuchJobException("Invalid job");
    }*/
}

package lab12_00p_exceptions.ResturantTask;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException(String exceptionMsg) {
        super(exceptionMsg);
    }


}

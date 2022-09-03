package homeworkExceptionHnadling;

public class MyCustomRuntimeException extends RuntimeException{
    String message;

    public MyCustomRuntimeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

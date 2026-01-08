package ru.courses.math;

public class OperationAttemptException extends Exception{

    public OperationAttemptException() {
        super();
    }

    public OperationAttemptException(String message){
        super(message);
    }

    public OperationAttemptException(String message, Throwable cause){
        super(message,cause);
    }


}

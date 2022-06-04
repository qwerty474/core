package Exceptions;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class CustomException extends IllegalStateException {
    public CustomException(String format) {

    }
//    public CustomException(String message) {
//        super(ExceptionUtils.addScenarioInfo(message));
//    }
//
//    public CustomException(String message, Throwable throwable) {
//        super(ExceptionUtils.addScenarioInfo(message), throwable);
//    }

}

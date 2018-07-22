package hello;

import hello.ex.CustomException01;
import hello.ex.CustomException02;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Set;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler({CustomException01.class,})
    public ResponseEntity<Object> handleCustomException01Exception(CustomException01 ex, WebRequest request) throws Exception {
        return new ResponseEntity<>(BaseResponse.fail("CustomException01异常", null), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({CustomException02.class,})
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public final BaseResponse handleCustomException02Exception(CustomException02 ex, WebRequest request) throws Exception {
        return BaseResponse.fail("CustomException02异常", null);
    }

}

package hello;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    Boolean isSuccess;
    String msg;
    Object result;

}

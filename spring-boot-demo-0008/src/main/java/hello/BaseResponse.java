package hello;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {

    private Boolean success;
    private String msg;
    private Object result;

    public static BaseResponse success(String msg, Object result) {
        return new BaseResponse(true, msg, result);
    }

    public static BaseResponse fail(String msg, Object result) {
        return new BaseResponse(false, msg, result);
    }

    private BaseResponse(Boolean isSuccess, String msg, Object result) {
        this.success = isSuccess;
        this.msg = msg;
        this.result = result;
    }

}

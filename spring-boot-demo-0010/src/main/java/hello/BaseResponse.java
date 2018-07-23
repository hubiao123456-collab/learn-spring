package hello;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    Boolean isSuccess;
    String msg;
    Object result;

    public static BaseResponse success(String msg, Object result) {
        return new BaseResponse(true, msg, result);
    }

    public static BaseResponse fail(String msg, Object result) {
        return new BaseResponse(false, msg, result);
    }

    public BaseResponse(Boolean isSuccess, String msg, Object result) {
        this.isSuccess = isSuccess;
        this.msg = msg;
        this.result = result;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "isSuccess=" + isSuccess +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}

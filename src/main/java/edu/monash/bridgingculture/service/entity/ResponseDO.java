package edu.monash.bridgingculture.service.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseDO {

    private boolean success;
    private String msg;
    private Object data;

    public ResponseDO() {
    }

    public ResponseDO(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResponseDO(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseDO success(Object data){
        return new ResponseDO(true, "ok", data);
    }

    public static  ResponseDO fail(String msg){
        return new ResponseDO(false, msg, null);
    }

    public static  ResponseDO fail(String msg, Object data){
        return new ResponseDO(false, msg, data);
    }

}

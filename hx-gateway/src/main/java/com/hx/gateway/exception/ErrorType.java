package com.hx.gateway.exception;
/**
* @Date :2020/10/13 11:12
* @Description :
* @Version :V1.0
*/
public interface ErrorType {
    /**
     * 返回code
     *
     * @return
     */
    String getCode();

    /**
     * 返回mesg
     *
     * @return
     */
    String getMesg();
}

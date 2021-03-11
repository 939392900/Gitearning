package com.ywc.excep;

/**
 * 自定义的运行时异常
 *
 * @author BaiGei
 * @date 2021-03-09 16:14
 */
public class NotEnoughException extends RuntimeException {
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}

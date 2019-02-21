package com.demo.example.common.exception;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

/**
 * Created by luhaob on 2019/2/14.
 */
public class DemoHttpException  extends IOException {
    /**
     *
     */
    public DemoHttpException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public DemoHttpException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public DemoHttpException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public DemoHttpException(Throwable cause) {
        super(cause);
    }
}

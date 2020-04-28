package chenjiajin.disponse_exception_demo.all_exception;

import chenjiajin.disponse_exception_demo.BaseException;
import chenjiajin.disponse_exception_demo.ErrorCode;

import java.util.Map;

public class ResourceServerBadException extends BaseException {
    /**
     * 根据类名被抛出的异常会在这里被接收处理
     * @param data
     */
    public ResourceServerBadException(Map<String, Object> data) {
        super(ErrorCode.REQUEST_VALIDATION_FAILED, data);
    }

}

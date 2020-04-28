package chenjiajin.disponse_exception_demo.all_exception;

import chenjiajin.disponse_exception_demo.BaseException;
import chenjiajin.disponse_exception_demo.ErrorCode;

import java.util.Map;

/**
 * 定义一个类会抛出的异常的集合类
 */
public class ResourceNotFoundException extends BaseException {
    /**
     * 根据类名被抛出的异常会在这里被接收处理
     * @param data
     */
    public  ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }

}

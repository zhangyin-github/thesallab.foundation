package thesallab.foundation.exception;

/**
 * 空字符串参数异常。
 *
 * @author Zhang, Yin
 */
public class EmptyStringArgumentException extends RuntimeException {

    // **************** 公开变量

    // **************** 私有变量

    // **************** 继承方法

    // **************** 公开方法

    /**
     * 空字符串参数异常构造函数。
     *
     * @param argument 参数名。
     */
    public EmptyStringArgumentException(String argument) {
        super((argument == null ? "Argument" : argument) + " must not be an " +
                "emtpy string.");
    }

    // **************** 私有方法

}

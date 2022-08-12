package org.zhengyu.common.result;

/**
 * @Des 公共结果码枚举类
 */
public enum CommonCodeEnum implements CodeMessage {
    /**
     * 操作成功
     */
    SUCCESS("0", "success"),

    /**
     * 操作失败（通常为业务逻辑错误）
     */
    FAILURE("1", "failure"),

    /**
     * 参数错误
     */
    PARAM_ERROR("405", "参数错误"),

    /**
     * 资源未找到
     */
    NO_FOUND("404", "no found"),

    /**
     * 服务器异常（其他未知错误）
     */
    SERVER_ERROR("500", "server error"),

    /**
     * 无权限
     */
    NO_PERMISSION("501", "no permission"),

    TOKEN_IS_EMPTY_ERR("40000", "未获取到令牌,禁止访问"),
    TOKEN_UNSUPPORTED_ERR("40001", "Token令牌格式不匹配,禁止访问"),
    TOKEN_MALFORMED_ERR("40002", "非正确的Token结构,禁止访问"),
    TOKEN_SIGNATURE_ERR("40003", "Token签名错误,无效签名,禁止访问"),
    TOKEN_EXPIRED_ERR("40004", "Token过期,禁止访问"),
    TOKEN_ILLEGAL_ARGUMENT_ERR("40005", "Token非法参数,禁止访问"),
    TOKEN_UNKNOWN_ERR("40006", "Token解析未知异常,禁止访问"),

    REGISTER_ACTION_LIMIT("20001", "系统正在处理中，请勿频繁操作");


    /**
     * 结果操作码
     */
    private final String code;
    /**
     * 结果消息
     */
    private final String msg;

    CommonCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}

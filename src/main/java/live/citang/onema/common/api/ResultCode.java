package live.citang.onema.common.api;

/**
 * @Author: citang
 * @Date: 2020-05-04 06:32
 * @Description: description what the main function of this file
 */

public enum ResultCode implements IErrorCode{

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数校验失败"),
    UNAUTHORIZED(401, "暂未登录或 token 已过期"),
    FORBIDDEN(403, "没有想过权限");

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}

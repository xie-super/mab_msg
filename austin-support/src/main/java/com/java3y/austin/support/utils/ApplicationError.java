package com.java3y.austin.support.utils;

import java.util.Arrays;

public enum ApplicationError {
    INNER_EXCEPTION("内部异常", false),
    RETRIEVABLE_EXCEPTION("可重试内部异常", true),
    PERMISSION_DENIED("无权限", false),
    ILLEGAL_ARGUMENT("非法参数", false),
    DUPLICATE_EXCEPTION("重复数据", false),
    OUT_OF_DATE("数据过期", true),
    NO_MATCH_DATA("找不到对应的数据", false),
    IO_EXCEPTION("网络读取失败", false),
    CLIENT_TIME_OUT("依赖服务超时", true),
    CLIENT_ERROR("依赖服务调用失败", false),
    OVER_FLOW("限流", true),
    EXIST_IN_TRANSIT_APPLY("存在进行中的申请", false),
    DB_OPERATION_ERROR("数据库操作失败", false),
    APPLY_BILL_OUT_FAILED("申请单出账失败", false),
    GET_CONTRACT_FAILED("获取合同失败", false)
    ;

    private final String desc;
    private final boolean canRetry;

    ApplicationError(String desc, boolean canRetry) {
        this.desc = desc;
        this.canRetry = canRetry;
    }

    public String code() {
        return name();
    }

    public String desc() {
        return desc;
    }

    public boolean canRetry() {
        return canRetry;
    }

    public static ApplicationError parse(String code) {
        if (code == null || code.length() == 0) {
            return null;
        }
        return Arrays.stream(ApplicationError.values()).filter(e -> e.code().equals(code)).findAny().orElse(null);
    }
}

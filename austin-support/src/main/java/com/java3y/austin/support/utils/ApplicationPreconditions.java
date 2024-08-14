package com.java3y.austin.support.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import com.alibaba.fastjson.JSON;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * usage
 *
 * @author mentalistxu
 * @date 2021/12/07
 */
public class ApplicationPreconditions {
    private static final int DEFAULT_MAX_PAGE_SIZE = 1000;

    public static <T> void notNull(T reference, String errorMessage) {
        checkState(Objects.nonNull((reference)), errorMessage);
    }

    public static void notBlank(String text, String errorMessage) {
        checkState(StringUtils.isNotBlank((text)), errorMessage);
    }

    public static void notEmpty(Collection<?> collection, String errorMessage) {
        checkState(CollectionUtils.isNotEmpty((collection)), errorMessage);
    }

    public static void notEmpty(Map<?, ?> map, String errorMessage) {
        checkState(MapUtils.isNotEmpty((map)), errorMessage);
    }

    public static void checkState(boolean expression, String errorMessage) {
        checkState(expression, ApplicationError.ILLEGAL_ARGUMENT, errorMessage);
    }

    public static void checkState(boolean expression, ApplicationError code, String errorMessage) {
        if (!expression) {
            throw new ApplicationException(code, errorMessage);
        }
    }

    public static void checkState(boolean expression, ApplicationError error) {
        if (!expression) {
            throw new ApplicationException(error, error.desc());
        }
    }

    // public static void checkOperator(OperatorDTO operator) {
    //     notNull(operator, "operator can not be null");
    //     notBlank(operator.getUserName(), "user name can not be blank");
    //     notBlank(operator.getUserId(), "user id can not be blank");
    // }

    public static void checkRpc(boolean expression, Pair<Object, Object> argsAndResultPair) {
        if (expression) {
            // 避免不必要的json序列化
            return;
        }
        checkState(false,
                ApplicationError.CLIENT_ERROR,
                String.format("args:%s,result:%s",
                        JSON.toJSONString(argsAndResultPair.getLeft()),
                        JSON.toJSONString(argsAndResultPair.getRight())));
    }

    public static void checkPage(Integer pageSize, Integer currentPage, Integer maxPageSize) {
        checkState(currentPage > 0, "currentPage must > 0");
        checkState(pageSize >= 0, "pageSize must >= 0");
        if (Objects.nonNull(maxPageSize)) {
            checkState(pageSize <= maxPageSize, "PageSize must <= " + maxPageSize);
        }
    }

    /**
     * check page params,default max page size:500
     *
     * @param pageSize
     * @param currentPage
     */
    public static void checkPage(Integer pageSize, Integer currentPage) {
        checkPage(pageSize, currentPage, DEFAULT_MAX_PAGE_SIZE);
    }
}

package com.java3y.austin.support.utils;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListUtil {
    /**
     * 将给定元素类型的list转换为另一个元素类型的list
     *
     * @param origins   输入list
     * @param converter 转换函数
     * @param <T>       输入类型
     * @param <R>       输出类型
     * @return
     */
    public static <T, R> List<R> convert(List<T> origins, Function<T, R> converter) {
        if (Objects.isNull(origins)) {
            return null;
        }
        if (origins.isEmpty()) {
            return new ArrayList<>();
        }
        return origins.stream().map(e -> converter.apply(e)).filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * 以指定的key将list转map,当key重复时不覆盖
     *
     * @param list
     * @param keyFunction
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K extends Serializable, V> Map<K, V> toMap(List<V> list, Function<V, K> keyFunction) {
        if (Objects.isNull(list)) {
            return null;
        }
        return list.stream().collect(Collectors.toMap(e -> keyFunction.apply(e), Function.identity(), (k1, k2) -> k1));
    }

    /**
     * 以指定的key和value将list转map,当key重复时不覆盖
     *
     * @param list
     * @param keyFunction
     * @param valueFunction
     * @param <K>
     * @param <V>
     * @param <E>
     * @return
     */
    public static <K extends Serializable, V, E> Map<K, V> toMap(List<E> list,
                                                                 Function<E, K> keyFunction,
                                                                 Function<E, V> valueFunction) {
        if (Objects.isNull(list)) {
            return null;
        }
        return list.stream().collect(Collectors.toMap(e -> keyFunction.apply(e), e -> valueFunction.apply(e),
                (k1, k2) -> k1));
    }

    /**
     * 以指定的key将list分组转map
     *
     * @param list
     * @param keyFunction
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K extends Serializable, V> Map<K, List<V>> group(List<V> list, Function<V, K> keyFunction) {
        if (Objects.isNull(list)) {
            return null;
        }
        return list.stream().collect(Collectors.groupingBy(e -> keyFunction.apply(e)));
    }

    /**
     * 将给定的list去重
     *
     * @param list
     * @param <V>
     * @return
     */
    public static <V> List<V> distinct(List<V> list) {
        if (CollectionUtils.isEmpty(list)) {
            return list;
        }
        Set<V> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    /**
     * 返回给定的list的第一个元素,NPE安全
     *
     * @param list
     * @param <V>
     * @return
     */
    public static <V> V first(List<V> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    /**
     * 已给定的keys为参考,查找elements中不存在的元素,并已key的格式返回
     *
     * @param keys
     * @param elements
     * @param keyFunction
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K extends Serializable, V> List<K> findNotExists(List<K> keys, List<V> elements,
                                                                    Function<V, K> keyFunction) {
        if (CollectionUtils.isEmpty(keys)) {
            return null;
        }
        if (CollectionUtils.isEmpty(elements)) {
            return keys;
        }
        Map<K, V> elementMap = toMap(elements, keyFunction);
        return keys.stream().filter(k -> !elementMap.containsKey(k)).collect(Collectors.toList());
    }

    /**
     * 已给定的keys为参考,查找elements中存在的元素,并已key的格式返回
     *
     * @param keys
     * @param elements
     * @param keyFunction
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K extends Serializable, V> List<K> findExists(List<K> keys, List<V> elements,
                                                                 Function<V, K> keyFunction) {
        if (CollectionUtils.isEmpty(keys)) {
            return null;
        }
        if (CollectionUtils.isEmpty(elements)) {
            return null;
        }
        Map<K, V> elementMap = toMap(elements, keyFunction);
        return keys.stream().filter(k -> elementMap.containsKey(k)).collect(Collectors.toList());
    }

    public static <K extends Serializable, V> List<K> extractKeys(List<V> elements, Function<V, K> keyFunction) {
        if (Objects.isNull(elements)) {
            return null;
        }
        return elements.stream().map(e -> keyFunction.apply(e)).collect(Collectors.toList());
    }

    public static String wrappedJoint(List<String> inputs, String delimiter) {
        return joint(inputs, delimiter, delimiter, delimiter);
    }

    public static String joint(List<String> inputs, String delimiter) {
        return joint(inputs, delimiter, "", "");
    }

    public static String joint(List<String> inputs, String delimiter, String prefix, String suffix) {
        if (Objects.isNull(inputs)) {
            return null;
        }
        if (inputs.isEmpty()) {
            return "";
        }
        return inputs.stream().collect(Collectors.joining(
                delimiter,
                prefix,
                suffix));
    }

    public static List<String> split(String input, String delimiter) {
        if (StringUtils.isBlank(input)) {
            return null;
        }
        return Arrays.stream(input.split(delimiter))
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.toList());
    }

    public static <T, R> List<T> map(Collection<R> objectList, Function<R, T> func) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Lists.newArrayList();
        }
        return objectList.stream().map(func).filter(Objects::nonNull).collect(Collectors.toList());
    }
}

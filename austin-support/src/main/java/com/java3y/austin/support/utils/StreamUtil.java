package com.java3y.austin.support.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUtil {

    public static <T, R> Map<T, R> list2Map(Collection<R> objectList, Function<R, T> keyMapper) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Maps.newHashMap();
        }
        return objectList.stream().collect(Collectors.toMap(keyMapper, Function.identity(), (v1, v2) -> v2));
    }

    public static <K, V, R> Map<K, V> list2Map(Collection<R> objectList, Function<R, K> keyMapper, Function<R, V> valueMapper) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Maps.newHashMap();
        }
        return objectList.stream().collect(Collectors.toMap(keyMapper, valueMapper));
    }

    public static <R> List<R> filter(Collection<R> objectList, Predicate<R> predicate) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Lists.newArrayList();
        }
        return objectList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static <T, R> List<T> map(Collection<R> objectList, Function<R, T> func) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Lists.newArrayList();
        }
        return objectList.stream().map(func).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static <T, R> Set<T> map2Set(Collection<R> objectList, Function<R, T> func) {
        if (CollectionUtils.isEmpty(objectList)) {
            return new HashSet<>();
        }
        return objectList.stream().map(func).filter(Objects::nonNull).collect(Collectors.toSet());
    }

    public static <T, R> Map<T, List<R>> group(List<R> list, Function<R, T> func) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap<>(1);
        }
        return list.stream().collect(Collectors.groupingBy(func));
    }

    public static <T, R, U> Map<T, List<U>> group(List<R> list, Function<R, T> keyFunc, Function<R, U> valueFunc) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap<>(1);
        }

        return list.stream().collect(Collectors.groupingBy(keyFunc, Collectors.mapping(valueFunc, Collectors.toList())));
    }

    public static <T, R> Map<T, R> groupOne(List<R> list, Function<R, T> func) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap<>(1);
        }
        return list.stream().collect(Collectors.toMap(func, Function.identity(), (v1, v2) -> v2));
    }

    public static <T, R> List<T> filterThenMap(Collection<R> objectList, Predicate<R> filter, Function<R, T> map) {
        if (CollectionUtils.isEmpty(objectList)) {
            return Lists.newArrayList();
        }
        return objectList.stream().filter(filter).map(map).filter(Objects::nonNull).collect(Collectors.toList());
    }
}


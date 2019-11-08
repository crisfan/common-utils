/**
 * meituan.com Inc.
 * Copyright (c) 2010-2019 All Rights Reserved.
 */

package com.fanyuhao.edu;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 *  StreamUtils
 *  美化stream的使用方法
 * </p>
 * @author fanyuhao
 * @version $Id:StreamUtils.java v1.0 2019/11/8 下午2:15 fanyuhao Exp $
 */
public class StreamUtils {

    public static <K, E> List<K> convert2List(Collection<E> collection, Function<E, K> ekFunction) {
        if (CollectionUtils.isEmpty(collection)) {
            return Lists.newArrayList();
        }
        return collection.stream().map(ekFunction).collect(Collectors.toList());
    }

    public static <K, E> Set<K> convert2Set(Collection<E> collection, Function<E, K> ekFunction) {
        if (CollectionUtils.isEmpty(collection)) {
            return Sets.newHashSet();
        }

        return collection.stream()
                .filter(Objects::nonNull)
                .map(ekFunction)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

}

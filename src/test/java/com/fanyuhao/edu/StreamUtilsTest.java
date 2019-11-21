/**
 * meituan.com Inc.
 * Copyright (c) 2010-2019 All Rights Reserved.
 */

package com.fanyuhao.edu;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 *  SteamUtils测试
 * </p>
 * @author fanyuhao
 * @version $Id:StreamUtilsTest.java v1.0 2019/11/8 下午2:23 fanyuhao Exp $
 */
public class StreamUtilsTest {

    @Test
    public void testConvert2List(){
        ArrayList<Integer> numbers = Lists.newArrayList(1, 2, 3);
        // The new writing
        List<Integer> newNumbers = StreamUtils.convert2List(numbers, x -> x + 1);
        System.out.println(newNumbers);

        // The old writing
        List<Integer> oldNumbers = numbers.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println(oldNumbers);
    }

    @Test
    public void testConvert2Set(){
        ArrayList<Integer> numbers = Lists.newArrayList(1, 2, 3);
        // The new writing
        Set<Integer> newNumbers = StreamUtils.convert2Set(numbers, x -> x + 1);
        System.out.println(newNumbers);

        // The old writing
        Set<Integer> oldNumbers = numbers.stream().map(x -> x + 1).collect(Collectors.toSet());
        System.out.println(oldNumbers);
    }
}

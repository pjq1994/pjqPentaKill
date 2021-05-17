package com.panda.complex.stream;

import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class createStream {

    /**
     * of
     * 生成长度有限的stream
     */
    @Test
    public void of(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        integerStream.forEach(System.out::println);
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        stringStream.forEach(System.out::println);
    }

    /**
     * generator
     * 生成无限长度的stream，其元素由Supplier接口提供,一般无限长度的stream会与filter，limit配合使用
     */
    @Test
    public void generator(){
        Stream<Double> doubleStream = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10);
        doubleStream.forEach(System.out::println);

        //Lambda简化
        Stream<Double> stream1 = Stream.generate(() -> Math.random()).limit(10);
        Stream<Double> stream2 = Stream.generate(Math::random).limit(10);
    }

    /**
     * iterate
     * 返回无限长度的stream,与generator不同的是，其是通过函数f迭代对给指定的元素种子而产生无限连续有序Stream，
     * 其中包含的元素可以认为是：seed，f(seed),f(f(seed))无限循环。
     */
    @Test
    public void iterate(){
        Stream.iterate(1,item -> item+1).limit(10).forEach(System.out::println);

    }


}

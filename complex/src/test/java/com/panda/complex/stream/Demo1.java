package com.panda.complex.stream;

import com.panda.complex.pojo.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Demo1 {
    protected static final List<Employee> list = Arrays.asList(
            new Employee(1, "Alex", 1000),
            new Employee(2, "Michael", 2000),
            new Employee(3, "Jack", 1500),
            new Employee(4, "Owen", 1500),
            new Employee(5, "Denny", 2000));

    protected static final List<List<Employee>> listFlat = Arrays.asList(
            Arrays.asList(new Employee(1, "Alex", 1000),
                    new Employee(2, "Michael", 2000)),
            Arrays.asList(new Employee(3, "Jack", 1500),
                    new Employee(4, "Owen", 1500)),
            Arrays.asList(new Employee(5, "Denny", 2000)));

    private static  List<Map<String,Object>> mapList = new ArrayList<>();

    static {
        Map<String,Object> map1 = new HashMap<>();
        map1.put("name","XiaoMing");
        map1.put("age",15);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("name","LiHua");
        map2.put("age",26);
        mapList.add(map1);
        mapList.add(map2);

    }


    int ids[] = new int[]{1,2,3,4,5};

    /**
     * 对stream进行过滤，将不满足条件去掉
     */
    @Test
    public void filter(){
        list.stream().filter(e -> e.getName().equals("Alex")).forEach(System.out::println);
        List<Employee> employeeList = list.stream().filter(e -> e.getMoney() == 2000).peek(System.out::println)
                .collect(Collectors.toList());
        Arrays.stream(ids).forEach(System.out::println);
    }

    /**
     * 将两个stream合并起来
     */
    @Test
    public void concat(){
        Stream.concat(Stream.of(1,2,3),Stream.of("a","b")).forEach(item -> System.out.println(item));
    }

    /**
     * distinct
     * 去除stream中重复的元素。生成新的没有重复元素的stream
     */
    @Test
    public void distinct(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 1, 2, 3).distinct();
        stream.forEach(System.out::println);
    }

    /**
     * map
     * 对stream元素进行数据结构的转换
     */
    @Test
    public void map(){
        Map<String, Object> result = mapList.stream().map(m -> {
            Map<String, Object> map1 = new HashMap<>();
            System.out.println("m:"+m);
            if (m.get("name").equals("XiaoMing")){
                map1.putAll(m);
            }
            return map1;
        }).collect(HashMap::new, (elseMap,map2) -> {
            elseMap.putAll(map2);
            System.out.println(elseMap+":"+map2);
        },(a,b)->{
                System.out.println(a+":"+b);
            }
        );
    }

    /**
     * flatMap
     * 将原Stream的元素取代为转换的Stream
     */
    @Test
    public void flatMap(){
        Stream.of(1,2,3).flatMap(num -> {
            System.out.println("num:"+num*10);
            return  Stream.of(num*10);
        }).forEach(System.out::println);
    }

    /**
     * peek
     * 生成一个包含原Stream的所有元素的新Stream，同时会提供一个消费函数（Consumer实例），
     * 新Stream每个元素被消费的时候都会执行给定的消费函数，并且消费函数优先执行
     */
    @Test
    public void peek(){
        Stream.of(1,2,3,4,5).peek(
                //消费函数有限执行
                num -> System.out.println("num:"+num*3)
        ).forEach(
                System.out::println
        );
    }











}

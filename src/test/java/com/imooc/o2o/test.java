package com.imooc.o2o;

import com.imooc.o2o.entity.Area;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class test {

    @Test
    public void queue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        System.out.println(queue.poll());

        System.out.println(queue.poll());
        try {
            System.out.println(queue.remove());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(queue.size());
    }

    @Test
    public void test() {
        String a = "aaaa";
        System.out.println(a.length());
    }
}
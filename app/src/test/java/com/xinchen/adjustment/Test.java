package com.xinchen.adjustment;

import java.util.Iterator;

/**
 * Created by ZH on 2016/4/17.
 */
public class Test implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }
}

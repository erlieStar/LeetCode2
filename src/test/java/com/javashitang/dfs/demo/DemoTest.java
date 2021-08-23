package com.javashitang.dfs.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-23
 */
public class DemoTest {

    @Test
    public void start() {
        int[][] grid = {{0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 0}};
        Demo demo = new Demo();
        demo.start(grid);
    }
}
package com.example.kiemthu.bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai1Test {

    private bai1 b1= new bai1();
    private int [] mang;
    @BeforeEach
        void setup(){
       mang = new int[]{2,6,7,8,9};
    }

    @Test
    void TestmangSoNguyen(){

        assertEquals(25,b1.mangSoNguyen(mang));
    }
    @Test
    void TestmangSoNgu(){

        assertEquals(32,b1.mangSoNguyen(new int[]{2,6,7,8,9}));
        assertEquals(-32,b1.mangSoNguyen(new int[]{-2,-6,-7,-8,-9}));
        assertEquals(0,b1.mangSoNguyen(new int[]{0}));
        assertThrows(IllegalArgumentException.class,()->b1.mangSoNguyen(new int[]{}));
        assertThrows(IllegalArgumentException.class,()->b1.mangSoNguyen(null));
    }


}
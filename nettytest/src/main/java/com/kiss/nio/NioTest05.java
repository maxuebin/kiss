package com.kiss.nio;

import java.nio.ByteBuffer;

public class NioTest05 {


    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        byteBuffer.putInt(100);
        byteBuffer.putLong(1000);
        byteBuffer.putChar('我');


        byteBuffer.flip();

        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getChar());




    }

}

package com.kiss.nio;

import java.nio.ByteBuffer;

public class NioTest07 {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        for(int a=0;a<byteBuffer.capacity();a++){
            byteBuffer.put((byte)a);
        }

        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
    }

}

package com.kiss.nio;

import com.sun.beans.editors.ByteEditor;

import java.nio.ByteBuffer;

public class NioTest06 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);


        for(int i=0;i<10;i++){
            byteBuffer.put((byte)i);
        }

        byteBuffer.position(2);
        byteBuffer.limit(6);

        ByteBuffer sliceBuffer = byteBuffer.slice();

        for(int a=0;a<sliceBuffer.capacity();a++){
            byte b = sliceBuffer.get(a);
            b*=2;
            sliceBuffer.put(a,b);
        }

        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
       while (byteBuffer.hasRemaining()){
           System.out.println(byteBuffer.get());
       }




    }
}

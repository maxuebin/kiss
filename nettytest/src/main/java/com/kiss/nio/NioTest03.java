package com.kiss.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest03 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream  = new FileOutputStream("D:\\NioTest03.txt");

        FileChannel fileChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        byte[] msg = "helle nihao !".getBytes();

        for (int i=0;i<msg.length;i++){
            byteBuffer.put(msg[i]);
        }

        byteBuffer.flip();

        fileChannel.write(byteBuffer);

        fileOutputStream.close();

    }

}

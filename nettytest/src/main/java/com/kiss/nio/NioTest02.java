package com.kiss.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest02 {


    public static void main(String[] args) throws Exception {


        FileInputStream inputStream = new FileInputStream("NioTest02.txt");

        FileChannel fileChannel = inputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);


        fileChannel.read(buffer);

        buffer.flip();

        while (buffer.hasRemaining()){
            byte a = buffer.get();
            System.out.println((char)a);
        }

        inputStream.close();

    }
}

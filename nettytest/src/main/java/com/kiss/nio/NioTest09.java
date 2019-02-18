package com.kiss.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest09 {

    public static void main(String[] args) throws Exception {

        RandomAccessFile accessFile = new RandomAccessFile("NioTest09.txt","rw");

        FileChannel fileChannel = accessFile.getChannel();

        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE,0,5);


        mappedByteBuffer.put(0, (byte) 'a');
        mappedByteBuffer.put(4,(byte) 'b');

        accessFile.close();


    }
}

package com.kiss.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest08 {

    public static void main(String[] args) throws Exception {


        FileInputStream fileInputStream = new FileInputStream("input1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");


        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(512);
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(512);

        while (true) {
            byteBuffer.clear();

            int read  = inputChannel.read(byteBuffer);


            if(read == -1){
                break;
            }
            byteBuffer.flip();
            outputChannel.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();


    }
}

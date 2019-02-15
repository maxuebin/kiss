package com.kiss.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest01 {


    public static void main(String[] args) {

        IntBuffer intBuffer = IntBuffer.allocate(10);

        for (int a=0;a<10;a++){

            int randomNumber = new SecureRandom().nextInt(20);
            intBuffer.put(randomNumber);
        }

        intBuffer.flip();

        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }

    }


}

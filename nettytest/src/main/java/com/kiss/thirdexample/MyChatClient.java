package com.kiss.thirdexample;

import com.kiss.test20190110.MyClientInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyChatClient {


    public static void main(String[] args) throws InterruptedException, IOException {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try{
            Bootstrap client = new Bootstrap();
            client.group(eventLoopGroup).channel(NioSocketChannel.class).handler(new MyChatClientInitializer());
            Channel channel = client.connect("localhost",8899).sync().channel();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            for(;;){
                channel.writeAndFlush(bufferedReader.readLine()+"\r\n");
            }


           // future.channel().closeFuture().sync();
        }finally {
            eventLoopGroup.shutdownGracefully();
        }

    }

}

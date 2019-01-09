package com.kiss.test20190109;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;


public class TestServerInitialize extends ChannelInitializer<SocketChannel>{


    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("httpServerCode",new HttpServerCodec());
        pipeline.addLast("TesthttpServerHandler",new TestHttpServerHandler());


    }
}

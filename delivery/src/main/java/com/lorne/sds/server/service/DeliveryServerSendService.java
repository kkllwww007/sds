package com.lorne.sds.server.service;

import com.lorne.sds.server.model.Server;
import io.netty.channel.ChannelHandlerContext; /**
 * create by lorne on 2017/10/13
 */
public interface DeliveryServerSendService {

    void delivery(ChannelHandlerContext ctx,Server server);
}

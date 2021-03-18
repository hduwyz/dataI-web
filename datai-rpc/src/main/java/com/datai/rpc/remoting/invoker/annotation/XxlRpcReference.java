package com.datai.rpc.remoting.invoker.annotation;

import com.datai.rpc.remoting.invoker.call.CallType;
import com.datai.rpc.remoting.invoker.route.LoadBalance;
import com.datai.rpc.remoting.net.Client;
import com.datai.rpc.remoting.net.impl.netty.client.NettyClient;
import com.datai.rpc.serialize.Serializer;
import com.datai.rpc.serialize.impl.HessianSerializer;

import java.lang.annotation.*;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XxlRpcReference {

    Class<? extends Client> client() default NettyClient.class;

    Class<? extends Serializer> serializer() default HessianSerializer.class;

    CallType callType() default CallType.SYNC;

    LoadBalance loadBalance() default LoadBalance.ROUND;

    //Class<?> iface;
    String version() default "";

    long timeout() default 1000;

    String address() default "";

    String accessToken() default "";

    //XxlRpcInvokeCallback invokeCallback() ;
}

package com.datai.rpc.remoting.net.params;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class XxlRpcRequest implements Serializable {

    private static final long serialVersionUID = 42L;

    private String requestId;
    private long createMillisTime;
    private String accessToken;

    private String className;
    private String methodName;
    private Class<?>[] parameterTypes;
    private Object[] parameters;

    private String version;
}

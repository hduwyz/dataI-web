package com.datai.rpc.remoting.net.params;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class XxlRpcResponse implements Serializable {
	private static final long serialVersionUID = 42L;


	private String requestId;
    private String errorMsg;
    private Object result;

}

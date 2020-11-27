package com.hx.gateway.exception;

import lombok.Data;

/**
 * @Date :2020/10/13 11:11
 * @Description :网关异常
 * @Version :V1.0
 */
@Data
public class GateWayException extends RuntimeException {

	private String code;

	private String msg;

	public GateWayException(SystemErrorType systemErrorType) {
		this.code = systemErrorType.getCode();
		this.msg = systemErrorType.getMesg();
	}

}

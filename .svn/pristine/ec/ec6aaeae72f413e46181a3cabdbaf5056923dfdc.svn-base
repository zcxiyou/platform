package com.hx.common.base;

import com.hx.common.utils.enums.ResultStatusEnum;

import lombok.Data;
import lombok.experimental.Accessors;

/**公共业务返回对象
 * @author daisi
 *
 */
@Data
@Accessors(chain=true)
public class CommonResponseBo<T> extends PagingResponseBo {
	 
	private static final long serialVersionUID = 2136505978761264753L;
	/**
	 * 业务状态
	 * @see ResultStatusEnum
	 */
	private String retCode= ResultStatusEnum.SUCCESS_CODE.code;
	private String retMsg;
	
	
	private T data;
	
	private Page page;
	
	
}

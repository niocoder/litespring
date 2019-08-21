package org.litespring.beans;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 11:19 2019/8/21
 * @Modified By:
 * @Version:
 */
public class BeansException extends RuntimeException {
	public BeansException(String msg) {
		super(msg);
	}

	public BeansException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

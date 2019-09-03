package org.litespring.beans;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 15:03 2019/8/27
 * @Modified By:
 * @Version:
 */
public class PropertyValue {
	private final String name;

	private final Object value;

	private boolean converted = false;

	private Object convertedValue;

	public PropertyValue(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public Object getValue() {
		return this.value;
	}
	public synchronized boolean isConverted() {
		return this.converted;
	}


	public synchronized void setConvertedValue(Object value) {
		this.converted = true;
		this.convertedValue = value;
	}

	public synchronized Object getConvertedValue() {
		return this.convertedValue;
	}
}

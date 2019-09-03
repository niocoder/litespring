package org.litespring.beans;

import com.sun.corba.se.impl.io.TypeMismatchException;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:58 2019/9/3
 * @Modified By:
 * @Version:
 */
public interface TypeConverter {

	<T> T convertIfNecessary(Object value,Class<T> requiredType) throws TypeMismatchException;
}

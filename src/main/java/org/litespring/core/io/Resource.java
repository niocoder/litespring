package org.litespring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 15:28 2019/8/21
 * @Modified By:
 * @Version:
 */
public interface Resource {
	public InputStream getInputStream() throws IOException;

	public String getDescription();
}

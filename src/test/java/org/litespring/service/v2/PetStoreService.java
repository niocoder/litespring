package org.litespring.service.v2;

import org.litespring.dao.v2.AccountDao;
import org.litespring.dao.v2.ItemDao;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:40 2019/8/26
 * @Modified By:
 * @Version:
 */
public class PetStoreService {

	private AccountDao accountDao;
	private ItemDao itemDao;
	private String owner;
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public ItemDao getItemDao() {
		return itemDao;
	}
}

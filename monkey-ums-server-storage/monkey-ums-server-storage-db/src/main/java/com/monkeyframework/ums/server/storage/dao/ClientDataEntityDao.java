package com.monkeyframework.ums.server.storage.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.ClientDataEntity;
import com.monkeyframework.ums.server.storage.mapper.ClientDataEntityMapper;

@Repository("clientDataEntityDao")
public class ClientDataEntityDao {

	@Resource
	private ClientDataEntityMapper clientDataEntityMapper;
	
	public void save(ClientDataEntity record) {
		record.setInsertdate(new Date());
		clientDataEntityMapper.insert(record);
	}
}

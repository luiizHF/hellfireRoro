package com.luiizhf.service.impl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.luiizhf.service.EjercicioService;

@Service("ejercicioService")
public class EjercicioServiceImpl implements EjercicioService{
	public static final Log LOG = LogFactory.getLog(EjercicioServiceImpl.class);

	@Override
	public String mensaje() {
		// TODO Auto-generated method stub
		
		LOG.info("hello from services message");
		return null;
	}

	
}

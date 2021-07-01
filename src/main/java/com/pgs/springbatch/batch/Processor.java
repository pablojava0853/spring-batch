package com.pgs.springbatch.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.pgs.springbatch.model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public Processor() {
		DEPT_NAMES.put("001", "Tecnologia");
		DEPT_NAMES.put("002", "Operacoes");
		DEPT_NAMES.put("003", "Contabilidade");
		DEPT_NAMES.put("004", "BPO");
	}
	@Override
	public User process(User user) throws Exception {
		String deptCode = user.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		user.setDept(dept);
		user.setTime(new Date());
		System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
		return user;
	}
}

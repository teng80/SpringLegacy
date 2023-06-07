package com.lgy.spring_8_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
//운영서버 정보
public class ApplicationConfigRun {
//	serverInfo 객체 생성
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("213.186.229.29");
		info.setPortNum("80");
		
		return info;
	}
}

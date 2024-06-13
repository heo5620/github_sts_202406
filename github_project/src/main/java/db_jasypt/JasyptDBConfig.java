package db_jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@Configuration //bean 설정 클래스
@EnableEncryptableProperties //application.properties 파일 한정 ENC() 문자열 복호화
public class JasyptDBConfig {
	
	@Autowired
	Environment enviroment;
	
	@Bean("jasyptEncryptor") //메소드 실행 후 리턴 객체 bean
	public StringEncryptor stringEncryptor() {
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPoolSize(1);
		config.setPassword(enviroment.getProperty("jasypt.password"));
		StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
		jasypt.setConfig(config);
		
		return jasypt;
	}

}

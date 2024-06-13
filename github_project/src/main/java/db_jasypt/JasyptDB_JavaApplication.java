package db_jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptDB_JavaApplication {

	public static void main(String[] args) {
		StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
		
		jasypt.setPassword("1234");
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fullstackdb";
		String username = "fullstack";
		String password = "fullstack";
		
		//암호화
		String en_driver = jasypt.encrypt(driver);
		String en_url = jasypt.encrypt(url);
		String en_username = jasypt.encrypt(username);
		String en_password = jasypt.encrypt(password);
		
		System.out.println(driver + " : " + en_driver);
		System.out.println(url + " : " + en_url);
		System.out.println(username + " : " + en_username);
		System.out.println(password + " : " + en_password);
	}

}

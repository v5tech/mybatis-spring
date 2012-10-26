Spring整合MyBatis

1、在控制台记录真实的sql语句
1.1、使用log4jdbc的配置
	1.1.1、添加log4jdbc的jar
	<dependency>
			<groupId>log4jdbc</groupId>
			<artifactId>log4jdbc4</artifactId>
			<version>1.2</version>
	</dependency>
	<dependency>
			<groupId>log4jdbc</groupId>
			<artifactId>log4jdbc4</artifactId>
			<version>1.2</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.6.6</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>1.6.6</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-jdk14</artifactId>
			<version>1.5.8</version>
	</dependency>
	1.1.2、参考src/main/resources/log4j.properties配置文件
	1.1.3、修改jdbc的driver和jdbc url（参考src/main/resources/applicationContext.xml）
		<property name="driverClassName" value="net.sf.log4jdbc.DriverSpy"></property>
		<property name="url" value="jdbc:log4jdbc:mysql://localhost:3306/mybatis"></property>
1.2、使用p6spy的配置		
	1.2.1、添加p6spy的jar
		<dependency>
			<groupId>p6spy</groupId>
			<artifactId>p6spy</artifactId>
			<version>1.3</version>
		</dependency>
	1.2.2、参考src/main/resources/spy.properties
	1.2.3、添加配置文件信息
		<property name="driverClassName" value="com.p6spy.engine.spy.P6SpyDriver"></property>
		<property name="url" value="jdbc:mysql://localhost:3306/mybatis"></property>

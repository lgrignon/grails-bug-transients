String databaseName = "bug_transients_inheritance";
println("configuring datasource - databaseName=" + databaseName)

dataSource {
	pooled = true
	dbCreate        = "update"
	driverClassName = "com.mysql.jdbc.Driver"
	// formatSql     = true
//	logSql        = true
	username        = "root"
	password        = ""
	url             = "jdbc:mysql://localhost:3306/" + databaseName + "?useUnicode=yes&characterEncoding=UTF-8"
	dialect         = "org.hibernate.dialect.MySQL5InnoDBDialect"
	properties {
		dbProperties {
			// Mysql specific driver properties
			// http://dev.mysql.com/doc/connector-j/en/connector-j-reference-configuration-properties.html
			// let Tomcat JDBC Pool handle reconnecting
			autoReconnect = true
		}
		maxActive = 50
		maxIdle = 25
		minIdle = 5
		initialSize = 5
		minEvictableIdleTimeMillis = 1800000
		timeBetweenEvictionRunsMillis = 1800000
		maxWait = 10000

		// testOnBorrow = true
		testWhileIdle = true
		// testOnReturn = true
		validationQuery = "SELECT 1"
		timeBetweenEvictionRunsMillis=60000

	}
}

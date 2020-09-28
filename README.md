# learning-spring

this code is facing issues when trying to use `postgres` docker container 
following error occures 
```
/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49799:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/lib/tools.jar:/Users/karthikhakim/my_branch/my_spring_pj/learning-spring/target/classes:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-thymeleaf/2.3.4.RELEASE/spring-boot-starter-thymeleaf-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter/2.3.4.RELEASE/spring-boot-starter-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot/2.3.4.RELEASE/spring-boot-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.3.4.RELEASE/spring-boot-autoconfigure-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.3.4.RELEASE/spring-boot-starter-logging-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/karthikhakim/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/karthikhakim/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.13.3/log4j-to-slf4j-2.13.3.jar:/Users/karthikhakim/.m2/repository/org/apache/logging/log4j/log4j-api/2.13.3/log4j-api-2.13.3.jar:/Users/karthikhakim/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:/Users/karthikhakim/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/karthikhakim/.m2/repository/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:/Users/karthikhakim/.m2/repository/org/thymeleaf/thymeleaf-spring5/3.0.11.RELEASE/thymeleaf-spring5-3.0.11.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/thymeleaf/thymeleaf/3.0.11.RELEASE/thymeleaf-3.0.11.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/attoparser/attoparser/2.0.5.RELEASE/attoparser-2.0.5.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/Users/karthikhakim/.m2/repository/org/thymeleaf/extras/thymeleaf-extras-java8time/3.0.4.RELEASE/thymeleaf-extras-java8time-3.0.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.3.4.RELEASE/spring-boot-starter-web-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.3.4.RELEASE/spring-boot-starter-json-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.11.2/jackson-databind-2.11.2.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.11.2/jackson-annotations-2.11.2.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.11.2/jackson-core-2.11.2.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.2/jackson-datatype-jdk8-2.11.2.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.2/jackson-datatype-jsr310-2.11.2.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.2/jackson-module-parameter-names-2.11.2.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.3.4.RELEASE/spring-boot-starter-tomcat-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.38/tomcat-embed-core-9.0.38.jar:/Users/karthikhakim/.m2/repository/org/glassfish/jakarta.el/3.0.3/jakarta.el-3.0.3.jar:/Users/karthikhakim/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.38/tomcat-embed-websocket-9.0.38.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-web/5.2.9.RELEASE/spring-web-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-beans/5.2.9.RELEASE/spring-beans-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-webmvc/5.2.9.RELEASE/spring-webmvc-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-aop/5.2.9.RELEASE/spring-aop-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-context/5.2.9.RELEASE/spring-context-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-expression/5.2.9.RELEASE/spring-expression-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.3.4.RELEASE/spring-boot-starter-data-jpa-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.3.4.RELEASE/spring-boot-starter-aop-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar:/Users/karthikhakim/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.3.4.RELEASE/spring-boot-starter-jdbc-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/com/zaxxer/HikariCP/3.4.5/HikariCP-3.4.5.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-jdbc/5.2.9.RELEASE/spring-jdbc-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:/Users/karthikhakim/.m2/repository/jakarta/persistence/jakarta.persistence-api/2.2.3/jakarta.persistence-api-2.2.3.jar:/Users/karthikhakim/.m2/repository/org/hibernate/hibernate-core/5.4.21.Final/hibernate-core-5.4.21.Final.jar:/Users/karthikhakim/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/Users/karthikhakim/.m2/repository/org/javassist/javassist/3.24.0-GA/javassist-3.24.0-GA.jar:/Users/karthikhakim/.m2/repository/net/bytebuddy/byte-buddy/1.10.14/byte-buddy-1.10.14.jar:/Users/karthikhakim/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/karthikhakim/.m2/repository/org/jboss/jandex/2.1.3.Final/jandex-2.1.3.Final.jar:/Users/karthikhakim/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/Users/karthikhakim/.m2/repository/org/dom4j/dom4j/2.1.3/dom4j-2.1.3.jar:/Users/karthikhakim/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.1.0.Final/hibernate-commons-annotations-5.1.0.Final.jar:/Users/karthikhakim/.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.3/jaxb-runtime-2.3.3.jar:/Users/karthikhakim/.m2/repository/org/glassfish/jaxb/txw2/2.3.3/txw2-2.3.3.jar:/Users/karthikhakim/.m2/repository/com/sun/istack/istack-commons-runtime/3.0.11/istack-commons-runtime-3.0.11.jar:/Users/karthikhakim/.m2/repository/com/sun/activation/jakarta.activation/1.2.2/jakarta.activation-1.2.2.jar:/Users/karthikhakim/.m2/repository/org/springframework/data/spring-data-jpa/2.3.4.RELEASE/spring-data-jpa-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/data/spring-data-commons/2.3.4.RELEASE/spring-data-commons-2.3.4.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-orm/5.2.9.RELEASE/spring-orm-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-tx/5.2.9.RELEASE/spring-tx-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-aspects/5.2.9.RELEASE/spring-aspects-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/postgresql/postgresql/42.2.16/postgresql-42.2.16.jar:/Users/karthikhakim/.m2/repository/org/checkerframework/checker-qual/3.5.0/checker-qual-3.5.0.jar:/Users/karthikhakim/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.jar:/Users/karthikhakim/.m2/repository/jakarta/activation/jakarta.activation-api/1.2.2/jakarta.activation-api-1.2.2.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-core/5.2.9.RELEASE/spring-core-5.2.9.RELEASE.jar:/Users/karthikhakim/.m2/repository/org/springframework/spring-jcl/5.2.9.RELEASE/spring-jcl-5.2.9.RELEASE.jar com.kartik.lil.learningspring.LearningSpringApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-28 10:15:44.519  INFO 9526 --- [           main] c.k.l.l.LearningSpringApplication        : Starting LearningSpringApplication on Karthik-Hakim with PID 9526 (/Users/karthikhakim/my_branch/my_spring_pj/learning-spring/target/classes started by karthikhakim in /Users/karthikhakim/my_branch/my_spring_pj/learning-spring)
2020-09-28 10:15:44.521  INFO 9526 --- [           main] c.k.l.l.LearningSpringApplication        : No active profile set, falling back to default profiles: default
2020-09-28 10:15:45.051  INFO 9526 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-09-28 10:15:45.124  INFO 9526 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 66ms. Found 3 JPA repository interfaces.
2020-09-28 10:15:45.468  INFO 9526 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-09-28 10:15:45.474  INFO 9526 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-09-28 10:15:45.474  INFO 9526 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.38]
2020-09-28 10:15:45.537  INFO 9526 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-09-28 10:15:45.537  INFO 9526 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 986 ms
2020-09-28 10:15:45.603  INFO 9526 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-09-28 10:15:46.681 ERROR 9526 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

org.postgresql.util.PSQLException: FATAL: database "dev" does not exist
	at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2553) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.QueryExecutorImpl.readStartupMessages(QueryExecutorImpl.java:2665) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.QueryExecutorImpl.<init>(QueryExecutorImpl.java:147) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:273) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:51) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:225) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.Driver.makeConnection(Driver.java:465) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.Driver.connect(Driver.java:264) ~[postgresql-42.2.16.jar:42.2.16]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:358) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:477) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:560) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) [HikariCP-3.4.5.jar:na]
	at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:158) [spring-jdbc-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:116) [spring-jdbc-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:79) [spring-jdbc-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:324) [spring-jdbc-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.boot.jdbc.EmbeddedDatabaseConnection.isEmbedded(EmbeddedDatabaseConnection.java:133) [spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer.isEmbedded(DataSourceInitializer.java:136) [spring-boot-autoconfigure-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer.isEnabled(DataSourceInitializer.java:128) [spring-boot-autoconfigure-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer.createSchema(DataSourceInitializer.java:95) [spring-boot-autoconfigure-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker.afterPropertiesSet(DataSourceInitializerInvoker.java:63) [spring-boot-autoconfigure-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1790) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:594) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:227) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1175) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:420) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:349) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerPostProcessor.postProcessAfterInitialization(DataSourceInitializerPostProcessor.java:52) ~[spring-boot-autoconfigure-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:430) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1798) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:594) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1307) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1227) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:884) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:788) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:227) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1356) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1203) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:556) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:408) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1336) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1176) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:556) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) [spring-beans-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1109) ~[spring-context-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869) ~[spring-context-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:551) ~[spring-context-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:143) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:758) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:750) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1237) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) ~[spring-boot-2.3.4.RELEASE.jar:2.3.4.RELEASE]
	at com.kartik.lil.learningspring.LearningSpringApplication.main(LearningSpringApplication.java:21) ~[classes/:na]

2020-09-28 10:15:46.761  INFO 9526 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-28 10:15:46.818  INFO 9526 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-09-28 10:15:46.866  WARN 9526 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-09-28 10:15:46.920  INFO 9526 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.21.Final
2020-09-28 10:15:47.167  INFO 9526 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
2020-09-28 10:15:47.172  INFO 9526 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-09-28 10:15:47.295  INFO 9526 --- [         task-1] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-09-28 10:15:47.343  INFO 9526 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-09-28 10:15:47.344  INFO 9526 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories…
2020-09-28 10:15:48.303 ERROR 9526 --- [         task-1] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

org.postgresql.util.PSQLException: FATAL: database "dev" does not exist
	at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2553) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.QueryExecutorImpl.readStartupMessages(QueryExecutorImpl.java:2665) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.QueryExecutorImpl.<init>(QueryExecutorImpl.java:147) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:273) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:51) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:225) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.Driver.makeConnection(Driver.java:465) ~[postgresql-42.2.16.jar:42.2.16]
	at org.postgresql.Driver.connect(Driver.java:264) ~[postgresql-42.2.16.jar:42.2.16]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:358) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:477) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:560) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) [HikariCP-3.4.5.jar:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:180) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:152) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:176) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:118) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1224) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1255) [hibernate-core-5.4.21.Final.jar:5.4.21.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58) [spring-orm-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:391) [spring-orm-5.2.9.RELEASE.jar:5.2.9.RELEASE]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_242]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_242]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_242]
	at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_242]

2020-09-28 10:15:48.304  WARN 9526 --- [         task-1] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata : FATAL: database "dev" does not exist
2020-09-28 10:15:48.316  INFO 9526 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.PostgreSQL95Dialect
2020-09-28 10:15:48.834  INFO 9526 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-09-28 10:15:48.841  INFO 9526 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-09-28 10:15:49.041  INFO 9526 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-09-28 10:15:49.052  INFO 9526 --- [           main] c.k.l.l.LearningSpringApplication        : Started LearningSpringApplication in 4.808 seconds (JVM running for 5.284)

```
when we try to connect to `postgres` container

though the container seems to work fine
```
[10:15:06] karthikhakim:bin git:(master*) $ docker  exec -it pg-docker bash
root@a01de48a3af8:/# psql -U postgres
psql (13.0 (Debian 13.0-1.pgdg100+1))
Type "help" for help.

postgres=# \l
                                 List of databases
   Name    |  Owner   | Encoding |  Collate   |   Ctype    |   Access privileges
-----------+----------+----------+------------+------------+-----------------------
 dev       | postgres | UTF8     | en_US.utf8 | en_US.utf8 |
 postgres  | postgres | UTF8     | en_US.utf8 | en_US.utf8 |
 template0 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
(4 rows)

postgres=#
postgres=# \q
root@a01de48a3af8:/# exit
[10:18:12] karthikhakim:bin git:(master*) $
```

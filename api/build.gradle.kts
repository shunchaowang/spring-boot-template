plugins {
	id 'org.springframework.boot' version '2.2.1.RELEASE'
	id 'io.spring.dependency-management' version '1.0.8.RELEASE'
	id 'java'
	id 'war'
}


configurations {
	developmentOnly
	runtimeClasspath {
		extendsFrom developmentOnly
	}
}


dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-oauth2-resource-server'
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'
	testImplementation('org.springframework.boot:spring-boot-starter-test') {
		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
	}
	testImplementation 'org.springframework.security:spring-security-test'
}

test {
	useJUnitPlatform()
}

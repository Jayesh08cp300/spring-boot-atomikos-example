package com.example.repository.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "customer.datasource")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDatasourceProperties {
	private String url;
	private String username;
	private String password;
	private String driverClassName;
}
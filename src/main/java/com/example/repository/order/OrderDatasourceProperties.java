package com.example.repository.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "order.datasource")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDatasourceProperties {
	private String url;
	private String username;
	private String password;
	private String driverClassName;
}
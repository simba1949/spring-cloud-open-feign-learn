package vip.openpark.quick.start.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 注解 @EnableFeignClients(basePackages = "vip.openpark.feign.api") 启用 Feign 客户端
 * 如果 Feign 客户端与服务端不在同一个模块，则需要指定包名
 *
 * @author anthony
 * @version 2024/9/27
 * @since 2024/9/27 21:48
 */
@EnableFeignClients(basePackages = "vip.openpark.feign.api")
@EnableDiscoveryClient
@SpringBootApplication
public class QuickStartConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuickStartConsumerApplication.class, args);
	}
}
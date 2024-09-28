package vip.openpark.quick.start.consumer.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anthony
 * @version 2024/9/28
 * @since 2024/9/28 13:36
 */
@Configuration
public class FeignConfig {
	@Bean
	public Retryer retryer() {
		// 第一个参数：重试间隔时间
		// 第二个参数：最大重试间隔时间，和 period * Math.pow(1.5, attempt - 1) 取最小值
		// 第三个参数：重试次数（总共请求几次）
		// 默认 Retryer.NEVER_RETRY;
		return new Retryer.Default(500, 1000, 3);
	}
}
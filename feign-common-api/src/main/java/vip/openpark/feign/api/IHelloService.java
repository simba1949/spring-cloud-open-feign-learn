package vip.openpark.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 注解 @FeignClient(name = "quick-start-provider")
 * name 定义服务名
 *
 * @author anthony
 * @version 2024/9/27
 * @since 2024/9/27 21:42
 */
@FeignClient("quick-start-provider")
public interface IHelloService {

	@GetMapping(path = "/hello")
	String hello(@RequestParam(name = "name", required = false) String name);
}
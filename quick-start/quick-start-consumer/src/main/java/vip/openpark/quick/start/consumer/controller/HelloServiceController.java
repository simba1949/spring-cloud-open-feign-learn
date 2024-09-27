package vip.openpark.quick.start.consumer.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.feign.api.IHelloService;

/**
 * @author anthony
 * @version 2024/9/27
 * @since 2024/9/27 22:05
 */
@Slf4j
@RestController
public class HelloServiceController {
	/**
	 * 直接注入远程调用服务提供方
	 */
	@Resource
	public IHelloService helloService;

	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false) String name) {
		return helloService.hello(name);
	}
}
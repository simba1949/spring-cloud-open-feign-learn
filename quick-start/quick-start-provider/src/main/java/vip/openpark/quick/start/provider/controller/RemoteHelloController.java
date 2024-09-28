package vip.openpark.quick.start.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2024/9/27
 * @since 2024/9/27 22:08
 */
@Slf4j
@RestController
public class RemoteHelloController {
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false) String name) {
		return "hello " + name;
	}

	@GetMapping(path = "/timeout-hello")
	public String timeoutHello(@RequestParam(name = "name", required = false) String name) {
		log.info("timeout hello");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			log.info("timeout exception", e);
		}
		return "timeout hello " + name;
	}
}
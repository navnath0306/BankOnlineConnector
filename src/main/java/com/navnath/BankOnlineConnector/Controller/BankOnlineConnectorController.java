package com.navnath.BankOnlineConnector.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankOnlineConnectorController {

	@GetMapping("/testConnectivity")
	public String testConnectivity() {
		return "SUCCESS";
	}
}

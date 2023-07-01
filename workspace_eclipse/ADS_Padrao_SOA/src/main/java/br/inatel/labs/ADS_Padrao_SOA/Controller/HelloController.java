package br.inatel.labs.ADS_Padrao_SOA.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("Hello")
public class HelloController {
	
	@GetMapping
	public MyMessage processarGetHello() {
		MyMessage msg = new MyMessage();
		msg.setInfo("olá, padrão arquitetural SOA");
		return msg;
	}
}

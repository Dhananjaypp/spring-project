package SendEmail.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SendEmail.model.ModelClass;
import SendEmail.service.ServiceImple;

@RestController
public class ControllerClass {
@Autowired
private ServiceImple Impl;

public ControllerClass(ServiceImple impl) {
	super();
	Impl = impl;
}
@PostMapping("url")
public List<ModelClass> get(@RequestBody ModelClass mod) throws AddressException, MessagingException
{
	return Impl.get(mod);

}

}

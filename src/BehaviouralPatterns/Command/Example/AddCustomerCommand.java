package BehaviouralPatterns.Command.Example;

import BehaviouralPatterns.Command.Example.Framework.Command;

public class AddCustomerCommand implements Command {
	private CustomerService service;

	@Override
	public void Execute() {
		service.addCustomer();
	}

	public AddCustomerCommand(CustomerService service) {
		this.service = service;
	}
}

package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HelloWorldPage extends BasePage {
	public HelloWorldPage(final PageParameters pageParameters) {
		super();

		String username = "";
		int age = pageParameters.get("age").toInt(-1);

		if(!pageParameters.get("username").isEmpty()){
			username = pageParameters.get("username").toString();
		}

		final Label result = new Label("result", "Username : " + username + " age : " + Integer.toString(age));
		add(result);

		add(new Label("message", "Hello World!"));

    }
}

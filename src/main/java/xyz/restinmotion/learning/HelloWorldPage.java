package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HelloWorldPage extends BasePage {
	public HelloWorldPage(final PageParameters pageParameters) {
		super();

		String username = "";

		if(!pageParameters.get("username").isEmpty()){
			username = pageParameters.get("username").toString();
		}

		final Label result = new Label("result", "Username : " + username);
		add(result);

		add(new Label("message", "Hello World!"));

    }
}

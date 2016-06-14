package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HelloWorldPage extends BasePage {
	public HelloWorldPage() {
		super();

		add(new Label("message", "Hello World!"));

    }
}

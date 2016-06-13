package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HelloWorldPage extends WebPage {
	public HelloWorldPage() {
		super();

		Link homePageLink = new Link("home_page_link") {
			@Override
			public void onClick() {
				this.setResponsePage(new HomePage());
			}
		};
		this.add(homePageLink);

		add(new Label("message", "Hello World!"));

		// TODO Add your page's components here

    }
}

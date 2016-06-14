package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

import java.util.Date;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage() {
		super();

		//label with version
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		//labes with date
		Date now = new Date();
		Label dateTimeLabel = new Label("datetime", now.toString());
		this.add(dateTimeLabel);

		Link helloWorldPageLink = new Link("hello_world_link") {
			@Override
			public void onClick() {
				this.setResponsePage(new HelloWorldPage());
			}
		};
		this.add(helloWorldPageLink);

    }
}

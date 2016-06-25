package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Date;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;
	private String username;


	public HomePage() {
		super();

		this.add(new FeedbackPanel("feedback"));

		final TextField<String> tUsername = new TextField<>("username",
				new PropertyModel(this, "username"));
		tUsername.setRequired(true);
		tUsername.add(new UsernameValidator());

		Form<?> form = new Form<Void>("userForm") {

			@Override
			protected void onSubmit() {
				final String usernameValue = username;//tUsername.getModelObject();

				PageParameters pageParameters = new PageParameters();
				pageParameters.add("username", usernameValue);
				setResponsePage(HelloWorldPage.class, pageParameters);
			}
		};

		add(form);
		form.add(tUsername);

		//label with version
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));


    }
}

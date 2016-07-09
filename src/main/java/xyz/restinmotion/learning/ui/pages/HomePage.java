package xyz.restinmotion.learning.ui.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import xyz.restinmotion.learning.ui.utils.UsernameValidator;
import xyz.restinmotion.learning.data.DataDumpLOL;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;
	private String username;
	private DataDumpLOL dataDump = new DataDumpLOL();


	public HomePage() {
		super();

		this.add(new FeedbackPanel("feedback"));

		final TextField<String> tUsername = new TextField<>("username");
		tUsername.setRequired(true);
		tUsername.add(new UsernameValidator());

		final TextField<Integer> tUserAge = new TextField<>("age");
		tUserAge.setRequired(false);

		final TextArea<String> tComment = new TextArea<>("comment");

		Form<?> form = new Form<DataDumpLOL>("userForm",
				new CompoundPropertyModel<DataDumpLOL>(dataDump)) {

			@Override
			protected void onSubmit() {
				final String usernameValue = username;//tUsername.getModelObject();

				PageParameters pageParameters = new PageParameters();
				pageParameters.add("username", dataDump.getUsername());
				pageParameters.add("age", dataDump.getAge());
				pageParameters.add("comment", dataDump.getComment());
				setResponsePage(HelloWorldPage.class, pageParameters);
			}
		};

		add(form);
		form.add(tUsername);
		form.add(tUserAge);
		form.add(tComment);

		//label with version
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));


    }
}

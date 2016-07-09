package xyz.restinmotion.learning.ui.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HelloWorldPage extends BasePage {
	private boolean valueCheckbox2 = true;
	private String rbModel = "";
	private String language = "";

	public HelloWorldPage(final PageParameters pageParameters) {
		super();

		this.add(new FeedbackPanel("feedback"));

		String username = "";
		int age = pageParameters.get("age").toInt(-1);

		if(!pageParameters.get("username").isEmpty()){
			username = pageParameters.get("username").toString();
		}

		final Label result = new Label("result", "Username : " + username + " age : " + Integer.toString(age));
		add(result);

		add(new Label("message", "Hello World!"));

		final CheckBox checkBox1 = new CheckBox("checkbox1", Model.of(Boolean.TRUE));
		final CheckBox checkBox2 = new CheckBox("checkbox2", new PropertyModel<Boolean>(this, "valueCheckbox2"));

		final List<Integer> POWERS = IntStream.range(1, 8).map(i -> 7 - i).map(pow -> 1 << pow).boxed().collect(Collectors.toList());
		final ArrayList<Integer> cbValues = new ArrayList<>(8);
		final CheckBoxMultipleChoice<Integer> cbPowers = new CheckBoxMultipleChoice<>("powers",
				new Model(cbValues), POWERS);

		final List<String> rbVALUES = Arrays.asList(new String[] {"val1", "val2", "val3"});
		final RadioChoice<String> rbCompTest = new RadioChoice<>("radio_test",
				new PropertyModel<String>(this, "rbModel"), rbVALUES);
		rbCompTest.setRequired(Boolean.TRUE);

		final List<String> LANGUAGES = Arrays.asList(new String[] {"Russian", "Esperanto", "English", "German", "Spanish"});
		final DropDownChoice<String> ddCompLanguage = new DropDownChoice<>("dd_language",
				new PropertyModel<String>(this, "language"), LANGUAGES);

		Form<Void> checkboxTestForm = new Form<Void>("checkbox_test") {
			@Override
			protected void onSubmit() {
				this.info("checkbox1 - " + checkBox1.getModelObject().toString());
				this.info("checkbox2 - " + Boolean.toString(valueCheckbox2));
				this.info("power list : " + cbValues.toString());
				this.info("resulting number is : " + cbValues.stream().mapToInt(i -> i.intValue()).sum());
				this.info("radio buttons intended var result : " + rbModel.toString());
				this.info("radio buttons model object : " + rbCompTest.getModelObject().toString());
				this.info("drow down menu choise : " + language);
			}
		};
		checkboxTestForm
				.add(checkBox1)
				.add(checkBox2)
				.add(cbPowers)
				.add(rbCompTest)
				.add(ddCompLanguage);

		this.add(checkboxTestForm);
    }
}

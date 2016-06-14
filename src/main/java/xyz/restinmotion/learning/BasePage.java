package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;

import java.util.Date;

/**
 * Created by efim on 14.06.16.
 */
public class BasePage extends WebPage {
    public BasePage() {
        this(null);
    }

    public BasePage(IModel model) {
        super(model);

        this.add(new NavigationPanel("main_navigation"));

        Date now = new Date();
        this.add(new Label("datetime", now.toString()));
    }

}

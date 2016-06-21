package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by efim on 14.06.16.
 */
public class NavigationPanel extends Panel {
    public NavigationPanel(String id) {
        super(id);

        Link homePageLink = new Link("home_link") {
            @Override
            public void onClick() {
                this.setResponsePage(new HomePage());
            }
        };
        this.add(homePageLink);

        Link helloWorldLink = new Link("hello_world_link") {
            @Override
            public void onClick() {
                this.setResponsePage(new HelloWorldPage(new PageParameters()));
            }
        };
        this.add(helloWorldLink);
    }
}

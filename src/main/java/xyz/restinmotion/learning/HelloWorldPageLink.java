package xyz.restinmotion.learning;

import org.apache.wicket.markup.html.link.Link;

/**
 * Created by efim on 13.06.16.
 */
public class HelloWorldPageLink extends Link {

    public HelloWorldPageLink(String id) {
        super(id);
    }

    @Override
    public void onClick() {
        HelloWorldPage targetPage = new HelloWorldPage();
        this.setResponsePage(targetPage);

    }
}

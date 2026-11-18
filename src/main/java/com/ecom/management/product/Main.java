package com.ecom.management.product;

import com.ecom.management.product.config.Config;
import dev.tamboui.toolkit.app.ToolkitApp;
import dev.tamboui.toolkit.Toolkit;
import dev.tamboui.toolkit.element.Element;
/**
 * Hello world!
 */
public class Main extends  ToolkitApp{

    @Override
    protected Element render() {
        String database = Config.env().get("DATABASE", "database.sqlite");
        return Toolkit.panel("My App",
            Toolkit.text("Hello! " + database).bold().cyan(),
            Toolkit.spacer(),
            Toolkit.text("Press 'q' to quit").dim()
        ).rounded();
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}

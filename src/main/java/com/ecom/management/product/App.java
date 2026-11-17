package com.ecom.management.product;

import dev.tamboui.toolkit.app.ToolkitApp;
import dev.tamboui.toolkit.Toolkit;
import dev.tamboui.toolkit.element.Element;
/**
 * Hello world!
 */
public class App extends  ToolkitApp{

    @Override
    protected Element render() {
        return Toolkit.panel("My App",
            Toolkit.text("Hello!").bold().cyan(),
            Toolkit.spacer(),
            Toolkit.text("Press 'q' to quit").dim()
        ).rounded();
    }

    public static void main(String[] args) throws Exception {
        new App().run();
    }
}

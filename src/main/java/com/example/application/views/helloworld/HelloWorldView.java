package com.example.application.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.combobox.ComboBox;
import java.util.ArrayList;
import java.util.List;


@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    private ComboBox combo;

    public HelloWorldView() {
        List<String> numbers = new ArrayList<>();
        numbers.add("uno");
        numbers.add("dos");
        addClassName("hello-world-view");
        name = new TextField("Tu nombre");
        sayHello = new Button("Di hola");
        combo = new ComboBox("ComboBox de ejemplo");
        combo.setItems(numbers);
        add(name, sayHello, combo);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hola " + name.getValue());
        });
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exodious;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author damir
 */
public class login extends VerticalLayout implements View {

    Navigator nav;
    ExternalResource slikaLogo = new ExternalResource("http://exodious.com/wp-content/uploads/2016/09/logo2-1.png");

    public login() {
        this.setId("loginPanel");
        this.setSpacing(true);
        Image logo = new Image();
        logo.setId("logo");
        logo.setSource(slikaLogo);
        logo.setHeight("18em");
        logo.setWidth("30em");
        Label welcome = new Label("Welcome, please login");
        welcome.setId("welcome");
        TextField username = new TextField("Your ID");
        PasswordField password = new PasswordField("Password");
        Button submit = new Button("Login");
        submit.setIcon(FontAwesome.SIGN_IN);
        submit.addStyleName(ValoTheme.BUTTON_PRIMARY);

        submit.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {

            }
        });

        addComponents(logo, welcome, username, password, submit);
        setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
        setComponentAlignment(welcome, Alignment.MIDDLE_CENTER);
        setComponentAlignment(username, Alignment.MIDDLE_CENTER);
        setComponentAlignment(password, Alignment.MIDDLE_CENTER);
        setComponentAlignment(submit, Alignment.MIDDLE_CENTER);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        nav = event.getNavigator();
    }

    public void checkGirls(String id, String pass) {

    }
}

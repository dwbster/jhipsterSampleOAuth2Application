package io.github.jhipster.oauth2.application.cucumber.stepdefs;

import io.github.jhipster.oauth2.application.JhipsterSampleOAuth2ApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleOAuth2ApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

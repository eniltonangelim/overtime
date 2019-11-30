module overtime.spring {

    requires overtime.domain;
    requires overtime.usecase;

    requires spring.core;
    requires spring.beans;
    requires spring.context;

    requires spring.boot.starter;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    exports br.com.angelim.overtime.application;
    exports br.com.angelim.overtime.application.config;

    opens br.com.angelim.overtime.application.config to spring.core;

}
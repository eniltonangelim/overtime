package br.com.angelim.overtime.domain.user.entity;

import br.com.angelim.overtime.domain.contact.entity.Contact;
import br.com.angelim.overtime.domain.credential.entity.Credential;
import br.com.angelim.overtime.domain.period.entity.Period;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private Contact contact;
    private Credential credential;
    private List<Period> periods = new ArrayList<>();

    public static User create() {
        return new User();
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    public User withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public User withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    public User withPeriod(Period period) {
        this.periods.add(period);
        return this;
    }

    public User withPeriods(List<Period> periods) {
        this.periods = periods;
        return this;
    }

    public List<Period> getPeriods() {
        return periods;
    }

}

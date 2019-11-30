package br.com.angelim.overtime.domain.period.entity;

import br.com.angelim.overtime.domain.comptime.entity.CompensatoryTimeType;

import java.util.Date;

public class Period {

    private CompensatoryTimeType type;
    private Date start;
    private Date end;

    public static Period create() {
        return new Period();
    }

    public Period ofType(CompensatoryTimeType type) {
        this.type = type;
        return this;
    }

    public Period startAt(Date start) {
        this.start = start;
        return this;
    }

    public Period endAt(Date end) {
        this.end = end;
        return this;
    }

    public CompensatoryTimeType getType() {
        return type;
    }

}

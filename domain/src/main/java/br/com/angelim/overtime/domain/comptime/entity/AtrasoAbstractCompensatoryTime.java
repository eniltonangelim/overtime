package br.com.angelim.overtime.domain.comptime.entity;

import br.com.angelim.overtime.domain.period.entity.Period;

public class AtrasoAbstractCompensatoryTime extends AbstractCompensatoryTime {

    public AtrasoAbstractCompensatoryTime() {
        super(CompensatoryTimeType.ATRASO);
    }

    @Override
    public AbstractCompensatoryTime check(Period period) {

        if (period.getType().equals(super.type)){

        }

        return super.checkNext(period);
    }

    @Override
    public void calculateCompensatoryTime() {
        System.out.println("Calcula sem intervalo");
    }

}

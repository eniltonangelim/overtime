package br.com.angelim.overtime.domain.comptime.entity.chain;

import br.com.angelim.overtime.domain.comptime.entity.CompensatoryTimeType;
import br.com.angelim.overtime.domain.period.entity.Period;

public class ExtraAbstractCompensatoryTime extends AbstractCompensatoryTime {

    public ExtraAbstractCompensatoryTime() {
        super(CompensatoryTimeType.EXTRA);
    }

    @Override
    public AbstractCompensatoryTime check(Period period) {
        return null;
    }

    @Override
    public void calculateCompensatoryTime() {
        System.out.println("Calcula com intervalo");
    }

}

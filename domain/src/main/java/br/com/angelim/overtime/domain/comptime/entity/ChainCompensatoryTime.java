package br.com.angelim.overtime.domain.comptime.entity;

import br.com.angelim.overtime.domain.comptime.entity.chain.AbstractCompensatoryTime;
import br.com.angelim.overtime.domain.comptime.entity.chain.AtrasoAbstractCompensatoryTime;
import br.com.angelim.overtime.domain.comptime.entity.chain.ExtraAbstractCompensatoryTime;
import br.com.angelim.overtime.domain.period.entity.Period;

public class ChainCompensatoryTime {

    private static AbstractCompensatoryTime init() {

        AbstractCompensatoryTime abstractCompensatoryTime = new AtrasoAbstractCompensatoryTime();
        abstractCompensatoryTime.linkWith(new ExtraAbstractCompensatoryTime());

        return abstractCompensatoryTime;

    }

    public static AbstractCompensatoryTime next(Period period) {
        return init().check(period);
    }

}

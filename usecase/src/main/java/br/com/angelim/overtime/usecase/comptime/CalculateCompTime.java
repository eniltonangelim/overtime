package br.com.angelim.overtime.usecase.comptime;

import br.com.angelim.overtime.domain.comptime.entity.ChainCompensatoryTime;
import br.com.angelim.overtime.domain.comptime.entity.chain.AbstractCompensatoryTime;
import br.com.angelim.overtime.domain.period.entity.Period;

public class CalculateCompTime {

    public void calculate(Period period) {

        AbstractCompensatoryTime abstractCompensatoryTime = ChainCompensatoryTime.next(period);
        abstractCompensatoryTime.calculateCompensatoryTime();

    }

}

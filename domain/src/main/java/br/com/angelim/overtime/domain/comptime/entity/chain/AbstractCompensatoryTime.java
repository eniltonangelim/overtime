package br.com.angelim.overtime.domain.comptime.entity.chain;

import br.com.angelim.overtime.domain.comptime.entity.CompensatoryTimeType;
import br.com.angelim.overtime.domain.period.entity.Period;

public abstract class AbstractCompensatoryTime {

    protected final CompensatoryTimeType type;
    protected Period period;

    private AbstractCompensatoryTime next;

    public AbstractCompensatoryTime(CompensatoryTimeType type) {
        this.type = type;
    }

    public AbstractCompensatoryTime linkWith(AbstractCompensatoryTime next) {
        this.next = next;
        return this;
    }

    public AbstractCompensatoryTime checkNext(Period period) {
        if (next == null)
            return null;

        return next.check(period);
    }

    public abstract AbstractCompensatoryTime check(Period period);

    public abstract void calculateCompensatoryTime();

}

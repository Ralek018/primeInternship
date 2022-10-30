package handlers;

import common.Type;

import java.util.HashMap;

public class President extends Approver{

    @Override
    public void approve(int id, double cost, Type type) {
            if (canApprove(id,cost,type)) {
                return;
            }
            next.approve(id, cost, type);
        }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
            limit = new HashMap<>() {{
            put(Type.CONSUMABLES, 1000.00);
            put(Type.CLERICAL, 2000.00);
            put(Type.GADGETS, 3000.00);
            put(Type.GAMING, 5000.00);
            put(Type.PC, 8000.00);
        }};
        return validate(id,cost,type,limit);
    }

}

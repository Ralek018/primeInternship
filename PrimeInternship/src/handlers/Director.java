package handlers;

import common.Type;

import java.util.HashMap;

/**
     * //TODO - If needed, validate logic and if possible optimize code.
     */
    public class Director extends Approver {


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
            put(Type.CONSUMABLES, 500.00);
            put(Type.CLERICAL, 1000.00);
            put(Type.GADGETS, 1500.00);
            put(Type.GAMING, 3500.00);
            put(Type.PC, 6000.00);
        }};
        return validate(id,cost,type,limit);
    }
}




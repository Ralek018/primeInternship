package handlers;

import common.Type;

import java.util.Map;

public abstract class Approver extends PurchaseValidator{
    protected Map<Type, Double> limit;
    protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, Type type);
    protected abstract boolean canApprove(int id, double cost, Type type);

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
            this.next = next;
            return next;
    }

}




class IdleState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Item selected :>");
        machine.setState(new ItemSelectedState());
    }
    @Override
    public void insertCoin(VendingMachine machine){
        System.out.println("Insert coind is not allowed in Idle State :<");
    }
    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Dispese item is not allowed in Idle State :<");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Machine is now out of order :>");
        machine.setState(new OutOfOrderState());
    }
}
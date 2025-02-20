class ItemSelectedState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Item already selected :>");
    }
    @Override
    public void insertCoin(VendingMachine machine){
        System.out.println("Coin inserted :>");
        machine.setState(new DispensingState());
    }
    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Cannot dispense wihout inserting a coin :<");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Machine is now out of order :<");
        machine.setState(new OutOfOrderState());
    }
}
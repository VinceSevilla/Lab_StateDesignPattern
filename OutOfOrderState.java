class OutOfOrderState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Machine is currenctly out of order. Cannot select an item :<");
    }
    @Override
    public void insertCoin(VendingMachine machine){
        System.out.println("Machine is currently out of order. Cannot insert a coin :<");
    }
    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Machine is currently out of order. Cannot dispense an item :<");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Machine is already out of order :<");
    }
}
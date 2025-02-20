class DispensingState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Cannot select an item while dispensing :<");
        machine.setState(new IdleState());
    }
    @Override
    public void insertCoin(VendingMachine machine){
        System.out.println("Cannot insert a coin while dispensing :<");
        machine.setState(new IdleState());
    }
    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Item dispensed :>");
        machine.setState(new IdleState());
    }
    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("An item is still disnpensing...");
    }
}
public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
        System.out.println();
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
        System.out.println();
        machine.setOutOfOrder();
        machine.selectItem();
    }
}
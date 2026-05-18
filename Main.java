class Locker {
    private int pin = 1234;
    private boolean isOpen = false;

    public void openLocker(int enteredpin) {
        if (enteredpin == pin) {
            isOpen = true;
            System.out.println("locker opened");
        } else {
            System.out.println("Wrong PIN");
        }
    }

    public void checkStatus() {

        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }

    }

}

class main {
    public static void main(String[] args) {
        Locker A = new Locker();
        A.checkStatus();
        A.openLocker(1111);
        A.openLocker(1234);
        A.checkStatus();
    }
}
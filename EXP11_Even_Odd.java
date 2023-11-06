public class EXP11_Even_Odd { // Change to EvenOddPrinting
    private static final int MAX_NUMBER = 10;
    private static int currentNumber = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            while (currentNumber <= MAX_NUMBER) {
                synchronized (lock) {
                    if (currentNumber % 2 == 0) {
                        System.out.println("Even: " + currentNumber);
                        currentNumber++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            while (currentNumber <= MAX_NUMBER) {
                synchronized (lock) {
                    if (currentNumber % 2 != 0) {
                        System.out.println("Odd: " + currentNumber);
                        currentNumber++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}

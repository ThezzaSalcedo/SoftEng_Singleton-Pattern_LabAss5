package singletonPattern;

public class QueuingSystem {
    private static QueuingSystem instance;

    //Current queue number
    private int currentQueueNumber = 1;

    //Private constructor to prevent direct instantiation
    private QueuingSystem() {
        System.out.println("Queuing System Started. First number: " + currentQueueNumber);
    }

    //Public method to get the single instance
    public static QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    // Get the next queue number
    public int getNextNumber() {
        return currentQueueNumber++;
    }

    // Display current serving number (for online monitoring)
    public int getCurrentServing() {
        return currentQueueNumber - 1;
    }

    // Reset queue to a specific number (for help desk use)
    public void resetQueue(int newNumber) {
        if (newNumber > 0) {
            currentQueueNumber = newNumber;
            System.out.println("Queue reset to: " + newNumber);
        } else {
            System.out.println("Invalid number! Must be positive.");
        }
    }
}

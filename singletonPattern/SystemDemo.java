package singletonPattern;

public class SystemDemo {
    public static void main(String[] args) {
        // Get the single queuing system
        QueuingSystem queue = QueuingSystem.getInstance();

        // Simulate people getting numbers
        System.out.println("Person 1 gets: " + queue.getNextNumber());
        System.out.println("Person 2 gets: " + queue.getNextNumber());
        System.out.println("Person 3 gets: " + queue.getNextNumber());

        // Online monitor shows current serving
        System.out.println("Now serving: " + queue.getCurrentServing());

        // Help desk resets queue
        queue.resetQueue(50);

        // New person after reset
        System.out.println("Next person gets: " + queue.getNextNumber());
        System.out.println("Now serving: " + queue.getCurrentServing());
    }
}
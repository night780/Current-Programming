<h1>Current Programming Demonstration</h1>

This program demonstrates the use of current programming or reactive programming in Java using the ReactiveX library. The program creates an observable that emits a sequence of integers and an observer that subscribes to the observable. The observer has four methods: onSubscribe, onNext, onError, and onComplete. The onSubscribe method is called when the observer subscribes to the observable, the onNext method is called for each item emitted by the observable, the onError method is called if the observable encounters an error, and the onComplete method is called when the observable completes.
Getting Started

These instructions will help you to run the program on your local machine for development and testing purposes.
Prerequisites

    Java Development Kit (JDK) version 8 or higher
    ReactiveX library

Running the program

    Clone the repository to your local machine
    Open the project in your preferred IDE
    Run the program

You should see the following output:

        Subscribed
        Received: 1
        Received: 2
        Received: 3
        Received: 4
        Received: 5
        Completed

Explanation

The program creates an observable that emits a sequence of integers from 1 to 5 and an observer that subscribes to the observable. When the observer subscribes to the observable, the observable starts emitting the integers and for each integer emitted, the observer's onNext method is called, printing "Received: x" where x is the current integer. Once all the integers have been emitted, the observable completes and the observer's onComplete method is called, printing "Completed".

This program demonstrates how current programming allows the program to react to the data stream as it occurs, handle the items emitted in a non-blocking manner, improving the performance and responsiveness of the program.
Built With

    Java Development Kit (JDK) version 8
    ReactiveX library

Author

    Jacob Jonas - night780


Note

This is just a demonstration, so it does not have any functionality to add, delete, or update the data, but it clearly explains how to use current programming with java and Re
# Concurrent Bank Account Simulation with Akka Actors

This project simulates a bank account system using the Akka Actor framework in Java/Scala. It demonstrates how concurrent transactions such as deposits and withdrawals can be handled in a thread-safe manner using actors.

## Description

The simulation features:

- A `BankAccount` actor that holds and manages the account balance.
- A `Deposit` class and a `Withdrawal` class that represent transaction messages.
- A `Main` class that initializes the simulation and performs 10 random transactions concurrently.

## How It Works

1. The `BankAccount` actor starts with a balance of £100 and prints this to the console.
2. The `Main` class:
   - Creates 10 random integers between -1000 and 1000.
   - Sends a `Deposit` message for positive values.
   - Sends a `Withdrawal` message for negative values (converted to positive for readability).
3. Each transaction updates the balance, and the new balance is printed after every operation.
4. Once all messages are processed, the program terminates.

## Requirements

- Java or Scala (depending on implementation)
- Akka library
- IDE or build tool like IntelliJ, sbt, or Maven


## How to Run

1. Make sure Akka is added as a dependency (via Maven or sbt).
2. Compile the program.
3. Run the `Main` class.
4. Check the console output for balance updates after each transaction.

## Output Example

Initial balance: £100
Deposit of £650 received. New balance: £750
Withdrawal of £120 received. New balance: £630
...
Final balance: £630

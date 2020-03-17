# count letters
A task from HARMAN

## Task description

#### Test assignment
    aabbcc -> a2b2c2
    aaaabc -> a4b1c1
    abc -> a1b1c1
    abbbaaaacc -> a5b3c2
    azc -> a1z1c1

# Instructions

### Libraries
   
#### Unit test

   - JUnit 5
   - Hamcrest
   
### Build

    mvn package

### Run

    java -jar ./target/count-letters-0.0.1-SNAPSHOT.jar "azbcabcbcc"

#### More information

 - The program respects [exit status](https://en.wikipedia.org/wiki/Exit_status) and [standard streams](https://en.wikipedia.org/wiki/Standard_streams).  

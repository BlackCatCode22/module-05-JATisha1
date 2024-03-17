I have corrected the code to read the hyena names from the file and store them in an ArrayList. I have also updated the Animal class constructor to accept the name as a parameter. The first three hyena names are printed to the console and then removed from the ArrayList. The first name is then used to create a new Animal object and added to the ArrayList of animals. The age and species are extracted from the line in the arrivingAnimals.txt file and used to create the Animal object. The process is repeated for each line in the file. Finally, the ArrayList of animals is printed to the console.

Experiment:
In the provided code, the hyena names are read from the file and stored in an ArrayList. The ArrayList is then used to create Animal objects. Here are some alternative approaches to achieve the same result:

Using a Queue:
Instead of using an ArrayList, you can use a Queue to store the hyena names. A Queue is a data structure that follows the First-In-First-Out (FIFO) rule. This means that the first element added to the Queue will be the first one to be removed.

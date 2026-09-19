This repository contains the solution for the first Software Engineering assignment, implementing a basic worker management system in Java.

1. Is your design ready to easily accept changes in how to calculate the total salary?

Yes, the design is highly flexible thanks to the principle of encapsulation. Instead of calculating the total salary in the Main class, the logic is encapsulated inside the Worker class with the getTotalSalary() method. If we need to calculate taxes or apply new formulas in the future, we only need to modify that single method in the Worker.java file.

2. How to implement the case where I don't use all of the 100 "spaces" for workers? I.e., my company only has 20.

To avoid wasting memory with empty spaces (which would happen if we used a static array), I used an ArrayList<Worker>. It is a dynamic data structure. It automatically adjusts its size based on the number of elements it contains. If the company only has 3 or 20 workers, the list will only consume memory for those specific objects, making the solution more efficient and scalable.
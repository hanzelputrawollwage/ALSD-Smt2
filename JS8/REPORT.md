|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 10 REPORT

# 2.1 Experiment 1: Assignment Submission

## 2.1.2 Verification / Result : 

![image](https://github.com/user-attachments/assets/76844878-1fca-4ae9-9d14-04c6a33392d7)

## 2.1.3 Question's Answer : 
1. Stack is used here is because the assignments are graded from the last, the order of this is LIFO (Last In First Out). The most recently submitted assignment is places on the top and graded first (First Out). Stack is used due to their LIFO order, making them ideal for managing variables, calling function, etc. A Queue method is a FIFO (First In First Out) which in this case, the oldest will be process first & it wouldn’t match this requirement of our program.

2. Difference push() and pop() methods
- push() : push is used when a student add / collecting an assignment (it adds a new assignment from student to top of stack method) 
- pop() : pop method is used when the lecturer grades the assignment that is on top of stack (it removes the assignment after grading them)

3. The reason why its important to use !isFull() method is because we need to check first to prevent the user adding data when stack is already full or not. So, we check to avoid error out of bound array index exception (because the array is fixed size).

4. In our program the assignment that can be stored is 5 (size : 5)

![image](https://github.com/user-attachments/assets/fc48fa21-6497-48f4-94de-79b0f42716cd)

5. To add the method when we want to know who’s collecting the assignment first is by adding : 
- In StudentAssignmentStack15.java class :

  ![image](https://github.com/user-attachments/assets/a5159a39-ebf7-428e-a335-533d6a92f00a)

- In StudentDemo15.java class :

  ![image](https://github.com/user-attachments/assets/7636b9bc-960e-4724-94cd-35690a54f3e8)

6. Method to count and return the number of assignment currently stored in the stack is by adding this method in StudentAssignment15.java class :

![image](https://github.com/user-attachments/assets/b6563406-aa27-42d9-9697-e725b77e008c)

7. What i learn from this experiment about Stack is, I learn about a liniear data structure called Stack. Stack has a LIFO order ( Last In First Out). Stack had a lot of operations, like push, pop, peek, clear, isFull, isEmpty, and clear to used for stack. In our experiment here, we use stack for grading cases for example.

# Experiment 2: Convert Assignment Grade to Binary

## 2.2.2 Verification

![image](https://github.com/user-attachments/assets/839408d7-9619-4d49-a0eb-5780c1e7728e)

## 2.2.3 Question's Answer : 
1. Workflow of the convertToBinary() method : 
- First we initialize a new ConversionStack15 to store binary digits remainder
- After initialize, we divide the score grade by 2, then push the remainder < grade % 2> to get modulo / -remainder into each iteration of stack, and make an update for grade to grade / 2
- When the grade or score is 0, all binary are stored in reverse order in stack
- Pop elements from stack and convert them into a string with LIFO order
- Last is return the binary string

2.  Change the loop condition to “while (grade != 0)” at convertToBinary() method, the result will still the same AS LONG THE NUMBER IS POSITIVE and not negative, and if we put negative number the loop will continually infinitely since INT division on negative num never reach zero.

# 2.4 Assignment

## RESULT : 
- Assigning Adi and Dika Letter Excuse

![image](https://github.com/user-attachments/assets/2f8d6e3e-43a7-406f-87c9-e2b87f9898d7)

- Viewing latest letter from (menu 3) “Dika”

![image](https://github.com/user-attachments/assets/47533f85-15a0-49b9-a872-e1224b161806)

- Checking if both (before processing the letter (menu 2)) is still on hold

![image](https://github.com/user-attachments/assets/d66a0acf-552f-4809-bdd6-209677d3b994)

- After processing Dika’s letter, Dika’s letter is no longer serachable

![image](https://github.com/user-attachments/assets/aab920fb-0047-4b39-9d1b-6912f0922dd9)




    

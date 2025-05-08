|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 11 REPORT

# 2.1 Experiment 1 : Queue Basic Operations

## 2.1.2. Output Verification / Result : 

![image](https://github.com/user-attachments/assets/4190aac9-cd2e-4665-9bf8-fe50b25ee08d)

![image](https://github.com/user-attachments/assets/82781576-091c-4c23-a95c-954ec9608898)

## 2.1.3. Question's Answer : 
1. Because, the “front = rear = -1” is indicating the queue is empty and the user didnt even added data yet, and size set into 0 is to represent the element, well in this case is none
2. Explaining enQueue :

    ![image](https://github.com/user-attachments/assets/acc24ebf-3b72-49fa-8ffc-cb653e715c87)

  - If rear is at the end  / max -1, it’ll wraps around rear to 0
  - And if it doesn’t, it’ll just moves to the next index (rear++)
  - In this case, it allows the queue to reuse the space after dequeue

3. Explaining deQueue : 

    ![image](https://github.com/user-attachments/assets/9f03aabb-7f05-4d10-8f4d-57718c945b86)
  - If the front is at the end of array, it’ll wrap around front to index 0
  - And if it doesn’t it also moves to the next element
  - In this case, it ensure the queue to maintains the correct front position after element removing

4. Because the first of valid element is at the “front” index, and it’s not always at index 0. If it start from 0 it may print invalid or printing old data in queue.
5. Reviewing the print method :

   ![image](https://github.com/user-attachments/assets/cb0d5e5a-bd6f-47a8-a42f-555a0f6d7713)

    It ensure the index wraps around if it reach the end of the array
6. Code snipplet that represents a queue overflow :
   
     ![image](https://github.com/user-attachments/assets/605ab728-1621-4a7d-b91b-8f0f15b28474)

7. Modify enQueue and deQueue
   - enqueue() :
    
     ![image](https://github.com/user-attachments/assets/1ffb3a56-2985-4e3a-b39e-263e716a460d)

   - dequeue() :
  
     ![image](https://github.com/user-attachments/assets/ea6d5ac7-3043-40b4-8bdc-6c0b5dc3d5cc)

# 2.2. Experiment 2 : Academic Service Queue

## 2.2.2 Result Verification

![image](https://github.com/user-attachments/assets/cc9a9e2a-9394-43f9-a48f-71e6b7d72a10)

![image](https://github.com/user-attachments/assets/9a66fd81-5772-4938-a081-ea189acf5047)
     
![image](https://github.com/user-attachments/assets/5b031ba5-27fb-4b55-8208-cc87018da147)

2.2.3 Question's Answer
1. The difference Queue15 and StudentQueue15 are, Queue15 manages / stores only an integer data, so it only integer data / only number. Meanwhile, the StudentQueue15 is accessing an objects & using String for attributes from student, where we in real life application of student management is allows us to treat attributes how we want not just number with integer.
2. Difference between enQueue() and deQueue() in StudentQueue15 and Queue15 is : 
- Queue : 
  a. enQueue(int dt) just putting a number
  b. deQueue returns an integer
- StudentQueue : 	
  a. enQueue(Student dt) it accepts a student object
  b. deQueue it return a student object & we can display all the student info later
3. It use -1 which mean empty, and not started yet. It help us to control the logic for the first insertion in the queues. And 0 is used in the StudentQueue15 because the index of the logic is started from index 0. Object queues are more easier to track that start from 0 index.
4. Modifying and adding new method called viewRear()

    ![image](https://github.com/user-attachments/assets/e3fe357a-7ec0-4b78-9a6c-6fa383bf8664)

    New case used

    ![image](https://github.com/user-attachments/assets/f8600b48-65ac-41f1-b6a6-10581d410b92)

# 2.3 Assignment

![image](https://github.com/user-attachments/assets/06e71e7c-899e-424b-b522-758d8dd7e7d2)

![image](https://github.com/user-attachments/assets/78304374-38db-4cd7-a64d-a79c14b26c1e)

![image](https://github.com/user-attachments/assets/7b4193fc-72de-4875-8315-49ecc8318b4e)

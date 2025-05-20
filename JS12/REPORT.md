|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 12 REPORT

# 2.1 Experiment 1: Implementing Single Linked List 

## 2.1.1 Output Verification

![image](https://github.com/user-attachments/assets/c7e4960e-c1a3-4598-bd31-e6e28b2fe235)

## 2.1.2 Question's Answers
1. The reason why it said linked list is empty is because the list is printed before any data is added. sll.print() executed first without any data added into linkedlist, and head == null. And so the isEmpty() returns true. Print is executed first without any data
2. Temp variable is used for references or a pointer to go through each element 1 by 1 from beggining to end, here’s the purpose in each method : 
- insertAt() : in here temp goes through each element 1 by 1 to node right before it hit the index (index-1) then it inserts a new node 
- insertAfter : temp is used to search through the list to find specific node w/ specific name, and if it’s found then it inserted new node
- print() : in here temp initialize as a head, then use loop through a list & print each node’s data until it reach temp == null condition
3. Modify the code for user input

![image](https://github.com/user-attachments/assets/aef8a6ed-92c5-4d39-b1e0-febaec08de36)
![image](https://github.com/user-attachments/assets/b97ab960-e4af-4948-935a-e7b303e150a9)

4. Without tail, adding to the end it become slower (notation O(n) ) as we must go through each element 1 by 1 from the head each time instead of directly linked it into the last node. If we had a tail we can directly append to the end with (notation O(1) ) which faster because we already reference to last node instead of needing a loop everytime we want to reach the end

# 2.2 Experiment 2: Accessing Element in Single Linked List

## 2.2.2 Output verification

![image](https://github.com/user-attachments/assets/fa574489-1104-4541-96c0-1dcda4353889)

## 2.2.3 Question's Answers
1. The break is used to exit the loop as soon as the target node is found and removed
2. temp.next = temp.next.next; is used to remove the node after temp by skipping it, then the if command will check, if temp.next == null it will assign tail with the value index of temp

# ASSIGNMENTS

![image](https://github.com/user-attachments/assets/a54997ea-e74a-4253-aa37-992792b6c58a)

![image](https://github.com/user-attachments/assets/a89ce7df-b2c5-4482-9273-9873ddd622bd)

![image](https://github.com/user-attachments/assets/cf57cad6-daca-4ff6-9954-1800f9d816ee)

![image](https://github.com/user-attachments/assets/5992f4b1-7aab-4c79-8f7d-c7714495f864)

![image](https://github.com/user-attachments/assets/f0f31d70-4b47-4e21-9a8a-d9fb5792ad9b)


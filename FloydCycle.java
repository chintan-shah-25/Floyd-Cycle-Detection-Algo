 public void findloop()
    {
      Link hare=first;                                                   //fast pointer
      Link tortoise=first;                                               //slow pointer
      while(hare!=tortoise && hare.next!=null)                           //second condition avoids null pointer exception
      {                                                                  //and checks for end of the linkedlist
        hare=hare.next.next;                                             //twice fast
        tortoise=tortoise.next;
      }
      if(hare==tortoise)                                                 //If they meet, it means loop
          System.out.println("Loop Detected");
      else
          System.out.println("No Loop");
      
      // This part finds out where loop starts. Slow pointer is assinged to the head and then move both the pointers at 
      // same speed and when they meet again, thats the starting point of loop. It can be proven easily with maths
      tortoise=first;
      while(hare!=tortoise) 
      {
        hare=hare.next;
        tortoise=tortoise.next;
        }
      
      System.out.println("Loop starts at "+hare.value);
      
      }

Report by Kai Waløen for Dat250-Expass2

First and foremost, this assignment was quite fun. I have some experience building fullstack applications but primarily using 
React on the frontend with JS/TS and either Django or FastAPI with Python on the backend. In terms of my exposure with 
Spring Boot, it is limited to attempting to hack into it as part of an assignment in INF226 Software Security. 

That being said, the first issue that I encountered was in installing Spring and Java. It was not as straight forward as
I am using linux but it was not that big of a challenge. I just googled around and tried different things - in addition the 
documentation was very good. 

My biggest hurdle in this assignment was related to getting familiar with Spring and Java. The verbosity of Java was refreshing 
in a weird way and once the classes were established, it was relatively straight forward to set up the endpoints in a reasonable way.
I have to admit that I combined Step 3 and 4, instead of using a Test-driven approach, I used a hybrid approach. What I 
mean  by this is that I was testing while I was implementing the handlers. This was a much more intuitive way to go forward
since I was unfamiliar with how the endpoint would look like and how this would fit with the requirements described in 
Step 3. I also feel that this is more of a natural way for me to work. 

I used Intellij's HTTP Client for this assignment which a test scenario can be found in the test folder called HTTPTests.http.
I found it to be very straight forward to use however it was buggy at times. It ran tests that I was not clicking on which 
was only resolved by restarting IntelliJ. The 12 automated tests in HTTPTests.http are passing however I suspect that they
are not running properly. 

That brings me on to pending issues with this assignment that have not been solved as of yet. The automated tests would benefit
with a proper look through. Another aspect that would benefit with redoing are removing all unused functions in the classes. 
I decided to keep them in for now as it seems that we will use this project for further assignments and thought it may be
beneficial to keep for now. I also did not complete Steps 6 and 7. I also wrote some functions in the handler classes that 
I know are not efficient and could lead to latency if the number of requests become large. I would like to take time to 
refactor these but for now they are left unsolved. From the testing that I have done, they work as described in the scenario
in Step 3. Since I am working fulltime as I pursue my studies, I hope that it is acceptable that I do not submit a fully polished assignment. 
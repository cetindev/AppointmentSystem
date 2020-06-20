# Appointment System


academician-student basic appointment system
The student receives ravdev from the academician, but the time interval should be empty in the academic presentations of the student.
If it is not empty, no appointment can be made. It is requested to make an appointment for another date.


We have a main method in this class and the method can access all classes.
In the Main method, I made a console, whichever operation he wanted to do, by pressing the numbers I specified, he can make it easy.
I wrote in the comment lines where and what I did between my codes.
He does everything he wants in his homework.
Outputs of the code
The picture below is the console image of the assignment.
It is enough to enter with a number.If you want to exit the program, you must also press 0.
Because in my code, I made the console return in an infinite loop, and the user should only do one operation and reach other operations.
We also use files in all processes. We either receive or print the data
![Ekran Alıntısı](https://user-images.githubusercontent.com/57585087/85201138-a86ac780-b305-11ea-8659-686dcaaec480.PNG)

In the 2nd picture below, the user performs the operation written by pressing 1 and adds an appointment. In order to add an appointment, the registration number of a desired academician is required, since the registration numbers are unique, there is no problem.
Similarly, we read this process by reading the data in the appointment.txt file and printing it on the screen.
In the code I wrote, I collect the data in one line and save all its information and there is only a space between each information, and I throw it into a series with the split method, we receive that data one by one and we can reach the information of the selected person by comparing the registry or number in this way.
![Ekran Alıntısı002](https://user-images.githubusercontent.com/57585087/85201140-a99bf480-b305-11ea-8ed7-f372cbb354ef.PNG)

If two points between date (.) And hour and minute (:) are noted while making an appointment, no problem will arise.
If there is an appointment at the entered date and time, it does not take the appointment and exits the program.

At the same time, the student's number, name, surname, department, registration year, e-mail, telephone information will be kept. The academician's registration number, name, surname, department, e-mail, telephone, title information will be kept. "
I have defined such information in the class, and the general variables in the person class have been extended to all classes.
The information in the files has been done as in the homework and each line represents one person and there is information between each information. At the same time, all appointments are displayed on the screen. Examples of the situations I have mentioned are below.
In the picture below; Displays all the appointments of the academic belonging to the registration number entered.
It reads this data from the file and outputs it to the screen.
At the same time, the user can evaluate the dates by making an inference.
![Ekran Alıntısı2](https://user-images.githubusercontent.com/57585087/85201142-a99bf480-b305-11ea-97a2-c1ae85b70488.PNG)

It also displays the total number of appointments of the academic belonging to the registration number entered.
If he asks the date, start time, end time of the user to make the appointment later,
If it is not written as 12.05.2000 it will give an error because I made it written from that format using the Date special class.
It is mandatory to have two points between 12:00 hours (:)
![Ekran Alıntısı3](https://user-images.githubusercontent.com/57585087/85201143-aacd2180-b305-11ea-97c8-b78dfe589390.PNG)
If there is an appointment within the entered date and time, it does not take the appointment and exits the program.
There is an example in the picture below
![Ekran Alıntısı4](https://user-images.githubusercontent.com/57585087/85201144-aacd2180-b305-11ea-94ef-fca5e62d2e07.PNG)
In the picture above, the user wanted to see all the appointments by pressing 2 and this information was read from the file and displayed on the screen in the appointment.txt file.
![Ekran Alıntısı5PNG](https://user-images.githubusercontent.com/57585087/85201146-ab65b800-b305-11ea-8c36-c336c105e134.PNG)

![Ekran Alıntısı6](https://user-images.githubusercontent.com/57585087/85201147-abfe4e80-b305-11ea-9be0-b7d44e415161.PNG)
![Ekran Alıntısı7](https://user-images.githubusercontent.com/57585087/85201148-ac96e500-b305-11ea-9779-bd00f99d913f.PNG)
![Ekran Alıntısı8](https://user-images.githubusercontent.com/57585087/85201149-ad2f7b80-b305-11ea-9e7d-c2e2a99d2613.PNG)
![Ekran Alıntısı9 10 (1)](https://user-images.githubusercontent.com/57585087/85201150-adc81200-b305-11ea-8977-5d827f3c99e8.PNG)
![Ekran Alıntısı9 10 (2)](https://user-images.githubusercontent.com/57585087/85201151-ae60a880-b305-11ea-9f30-220e0f30f363.PNG)
![Ekran Alıntısı10](https://user-images.githubusercontent.com/57585087/85201153-af91d580-b305-11ea-914c-7fd137650873.PNG)
![Ekran Alıntısı12](https://user-images.githubusercontent.com/57585087/85201154-b02a6c00-b305-11ea-86b1-17ea7aa862b2.PNG)
![Ekran Alıntısı13](https://user-images.githubusercontent.com/57585087/85201155-b0c30280-b305-11ea-9618-f006f10677a9.PNG)
![Ekran Alıntısı14](https://user-images.githubusercontent.com/57585087/85201156-b15b9900-b305-11ea-86cf-193fe06079b5.PNG)
![Ekran Alıntısı 001PNG](https://user-images.githubusercontent.com/57585087/85201157-b1f42f80-b305-11ea-98a0-bb967df72fcb.PNG)










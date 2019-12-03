# Storing-Student-Info

Create a class named Student which contains student information.
Specifically, create three variables: name, grade, and gpa.

Create an instance of type Student and read the values from user input.

Create three files on your desktop named: names, grades, and gpas.

Store the information from this Student in those files.
(name stored in names, grade => grades, gpa => gpas)

==============

Create a method in your Student class called getInfo(), which prints a line that looks like this:
My name is Mike. I'm in grade 15 and I have a 4.0 GPA. For now, at least...

Create three files on your desktop named: names, grades, and gpas.
Create 10 lines of information in each file.

Read the lines of each file and store their contents in their own arrays.

Create an array of type Student[] and fill it using those arrays.

To confirm your work, loop through your Student[] array and call the getInfo method on each Student.

================

Instead of storing your student information in three seperate files,
let's try storing them in one.

You can do this by separating columns of data with a designated character.
For instance, separting student data with a comma might look like this:
Mike,15,4.0

While separating student data with a space would look like this:
Mike 15 4.0

For this exercise, let's stick with commas.

Create a new file on your desktop named students.csv (csv means Comma Separated Values)
Fill it up with 10 lines of data (feel free to use the values from your old files!)

Now, read each line of the file and, with the help of String.split(), 
store the line in a String array.

Then, immediately store the data from that array in a Student object.

Finally, add that Student object to your Student[] array and continue with the loop.

To confirm your work, loop through your Student[] array and call the getInfo method on each Student.

EduTracker - Eclipse Java Project
=================================

What is included
-----------------
- src/edu/main/Student.java
- src/edu/main/Mentor.java
- src/edu/main/Main.java
- src/edu/utils/StatusPrinter.java
- .project (Eclipse project file)
- .classpath (Eclipse classpath)
- README.txt (this file)

How to import into Eclipse
--------------------------
1. Download and unzip the project archive into a folder.
2. In Eclipse: File -> Import -> Existing Projects into Workspace -> Select root directory -> Browse -> choose the unzipped folder containing the .project file -> Finish.
3. Run the main class: edu.main.Main (Right-click -> Run As -> Java Application).

Notes for the lab submission (follow your lab sheet)
---------------------------------------------------
- Make sure to change the Eclipse username display as required by your lab instructions before taking screenshots.
- Capture screenshots required by the assignment: Eclipse workspace path, lab portal with username changed, code pages showing each subpart, etc.
- Include student name and BITS id on each page as instructed.
- Do NOT submit files with missing usernames or missing required screenshots (as per lab rules).

Explanation highlights (mapping to lab questions)
------------------------------------------------
Q1. Constructors, Access Modifiers, and this Keyword
  - Student.java contains private fields and both parameterized & default constructors.
  - Default constructor calls parameterized one using this(...).
  - showDetails() prints details and uses this keyword.

Q2. Static and Final Keywords, Instance vs Local Variables
  - totalStudents is static and incremented in every constructor.
  - collegeName is final and cannot be changed.
  - calculateGrade() demonstrates a local int grade variable and prints Grade A / Grade B.

Q3. Method and Constructor Overloading, Returning Values
  - updateMarks(float) and updateMarks(float[]) are overloaded.
  - Multiple constructors provided (ID only, ID+name, full).
  - isPassed() returns boolean.

Q4. Objects as Parameters and Immutable vs Mutable
  - Mentor.assignMentor(Student s) assigns a mentor to the student.
  - Student.name (String) demonstrates immutability (no setter) while achievements (List) demonstrates mutability.

Q5. Packages, Imports, Accessibility, and Overriding
  - Packages: edu.main (Student, Mentor, Main) and edu.utils (StatusPrinter).
  - StatusPrinter overrides toString() and accesses Student via public getters.
  - Main imports edu.utils.* and uses StatusPrinter.printStatus().

If you want, I can:
- Add Javadoc comments for each method.
- Create a runnable runnable Jar.
- Generate a sample PDF with annotated screenshots (note: I cannot take screenshots of your environment).

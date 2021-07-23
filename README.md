1. New class StudentSerice
2. It will take List<Student> method from StudentController and it will be moved to class StudentSericIt is used for business logic for students layer
3. There is made a reference: private final StudentService studentService;
4. And in method List<Student> will be return studentService.getStudents()

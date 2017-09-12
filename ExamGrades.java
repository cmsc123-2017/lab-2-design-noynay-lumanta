/* xSignature, purpose, stub
 * xExamples
 * Template
 * Body
 * Test and debug
 */

class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  // TODO design a function that returns the highest grade
  /* TEMPLATE:
   *  this.grades
   * 
   * METHOD:
   */
  
  // -> double
  // Returns the highest grades in this array of Exam grades.
  
  double highestGrade(){
    double highest = 0;
    for(int i = 0; i < this.grades.length; i++){
      if (grades[i] > grades[i+1]){
          highest = grades[i];
      }    
    }
    return highest;
  }
  
}

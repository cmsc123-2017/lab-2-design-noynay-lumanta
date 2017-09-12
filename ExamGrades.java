/* xSignature, purpose, stub
 * xExamples
 * xTemplate
 * xBody
 * xTest and debug
 */

class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
<<<<<<< HEAD
  
  // TEMPLATE
  /*   Fields:
   *     this.grades
   *
   *	Methods:
   *     
   */

  // -> double
  // Returns the highest grade from this grades. 
  double highestGrade() {
  	double highest = 0;

  	for(int i = 0; < grades.length; i ++) {
  		if(highest > grades[i]) {
  			highest = grades[i];
  		}
  	}
  	return highest;
  }

}
=======
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
>>>>>>> 6fcb13c486449c21f27fa542b1110af08e647f9b

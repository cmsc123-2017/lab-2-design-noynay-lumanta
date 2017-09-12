class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
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
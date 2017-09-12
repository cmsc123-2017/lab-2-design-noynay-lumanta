class Book {
  Author author;
  String title;
  int year;  // year of publication
  
  // CONSTRUCTOR
  Book(Author author, String title, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.author   -- Author
   *     this.title    -- String
   *     this.year     -- int
   * 
   *   Methods:
   *     isSameAuthor(Book that)       -- boolean
   *     isPublishedBefore(Book that)  -- boolean
   *
   *   Methods of Author:
   *     this.author.equals()          -- boolean
   */
  

  // Book -> boolean
  // Returns true if this Book has the same author
  // as that book
  boolean isSameAuthor(Book that) {    
    return this.author.equals(that.author);
    
    // TEMPLATE
    /*    this.author
     * 
     *    that
     *    that.author
     */
  }
 

  // Book -> boolean
  // Returns true if this Book was published before that book.
  boolean isPublishedBefore(Book that) {
    if(this.year > that.year){
      return true;
    }else{
      return false;
    }

    // TEMPLATE
    /*    this.year
     * 
     *    that
     *    that.year
     */
  }
  

}

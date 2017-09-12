class Author {
  String name;
  String gender;
  
  Author(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }
  
  // TEMPLATE
  /*   Field:
   *    this.name
   *    this.gender
   *
   *   Method:
   *    equals(Author that)
   */
  
  // Author -> boolean
  // Returns true if the name and gender of this Author
  // matches the name and gender of that Author

  boolean equals(Author that) {
    return this.name.equals(that.name) && this.gender.equals(that.gender);

  // TEMPLATE
  /* this.name
   * 
   * that
   * that.name
   */

  }
}
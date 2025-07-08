package Array;

class StudentArray{
    public String name;
  
    StudentArray(String name){
        this.name = name;
    }
      
  	@Override
    public String toString(){
        return name;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArray[] myStudents = new StudentArray[]{
		          new StudentArray("Dharma"),new StudentArray("sanvi"),
		          new StudentArray("Rupa"),new StudentArray("Ajay")
		        };
		for(StudentArray m:myStudents){    
            System.out.println(m);
        }

	}

}

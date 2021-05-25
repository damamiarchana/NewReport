package date082012;

public class StudentInfo {
         String StudentName;
         String DepartmentName;
         int rollNo;
         String StudentAddress;
         String ClgName;
         
         public StudentInfo(String iStudentName,String iDepartmentName,int irollNo,String iStudnetAddress,String iclgName) {
        	 StudentName=iStudentName;
        	 DepartmentName=iDepartmentName;
        	 rollNo=irollNo;
        	 StudentAddress=iStudnetAddress;
        	 ClgName=iclgName;
         }
        	 public StudentInfo(String iStudentName,String iDepartmentName,int irollNo,String iStudnetAddress) {
            	 StudentName=iStudentName;
            	 DepartmentName=iDepartmentName;
            	 rollNo=irollNo;
            	 StudentAddress=iStudnetAddress;
            	 ClgName="AR Burla college";
         }
         void displaystudentDetails() {
     		System.out.println("StudentName:"+StudentName);
     		System.out.println("Department Name:"+DepartmentName);
     		System.out.println("Roll No:"+rollNo);
     		System.out.println("StudentAddress:"+StudentAddress);
     		System.out.println("College Name:"+ ClgName);





         }
         
}

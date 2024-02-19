import java.util.Arrays;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int rollno;
			double percentage;
			char result;
			String name;
			boolean status;
			
			int[] values= {12,34,56,67,45};
			String[] tech = {"php","java",".net","python"};
			
			
			rollno = (int)1.1;
			percentage = 1;
			result = 'P';
			name = "yash";
			status = true;
			
			//System.out.println(percentage);
			//System.out.print(rollno);
			
			System.out.println(Arrays.toString(values));
			System.out.println(Arrays.toString(tech));
			
			name = tech[0];
			System.out.println(name);
			
			for(int i=0;i<tech.length-1;i++) {
				System.out.println(tech[i]);
			}
			
			
	}

}

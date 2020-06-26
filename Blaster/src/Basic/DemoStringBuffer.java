package Basic;

public class DemoStringBuffer {

	public static void main(String[] args ) {
		
		StringBuffer sb = new StringBuffer("mohammed");
		sb.append(" md");
	
		sb.reverse();
	
		sb.delete(3, 5);
		
		sb.replace(5, 8, "mad");
		
		System.out.println(sb);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//StringBuffer sb = new StringBuffer("rajib");
		//sb.append(" miah");
		//sb.reverse();
		//sb.delete(5, 7);
		//sb.replace(5, 10," ahmed");
		//sb.capacity();
		
	
		
		//System.out.println(sb);
			
		}
				

	}
//string is object.
//stringBuffer is mutable or changable and thread safe.
// method avaiable for stringbuffer and stringbuilder are -append, insert, replace,delete, reverse, capacity, ensurecapacity.


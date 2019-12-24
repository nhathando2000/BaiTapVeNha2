package donguyennhathan.com;

import java.util.Scanner;

public class BaiTap2 {

	/**
	 * Đây là hàm tìm số âm trong 1 chuỗi bất kì
	 * Hàm này kiểm tra các kí tự(bắt đầu từ 1) có phải là số ko
	 * Nếu là số thì kiểm tra kí tự trước nó có phải dấu âm hay ko
	 * Nếu là số âm thì nó típ tục kiểm tra các ký tự phía sau có phải là số ko
	 * Nếu là số thì kết quả trả về số âm cuối cùng
	 * @param str chuỗi bất kỳ
	 * vd: abc-5xyz-12k91--p
	 */
	static void negativeNumberInStrings(String str)
	{
		char dauAm='-';
		for(int i=1; i<str.length();i++)
		{
			char ktI= str.charAt(i);
			char ktITruMot= str.charAt(i-1);
			if(Character.isDigit(ktI)&&Character.compare(ktITruMot, dauAm)==0)
			{
				String kq= "-"+ktI;
				int j=i+1;
//				Đây là cách 1
				while(Character.isDigit(str.charAt(j)))
				{
					char ktSauI= str.charAt(j);
					kq+=ktSauI;
					j++;
				}
/*
 * Đây là Cách 2
 * 				for(int j=i+1;j<str.length();j++)
				{
					char ktSauI= str.charAt(j);
					if(Character.isDigit(ktSauI))
					{
						kq+=ktSauI;
					}
					else
					{
						break;
					}
				}
 */
				System.out.println("Số âm là: "+kq);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập chuỗi:");
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		negativeNumberInStrings(str);
		
	}

}

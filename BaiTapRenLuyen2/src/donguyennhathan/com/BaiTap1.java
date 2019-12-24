package donguyennhathan.com;

import java.util.Random;
import java.util.Scanner;

public class BaiTap1 {

	/*
	 * Viết chương trình game đoán số từ 0 --> 5
	 * Khởi tạo ban đầu người chơi có 5đ
	 * Mỗi lần đoán đúng +1đ và đoán sai -1đ
	 * Người chơi tích lũy đủ 10đ thì thắng
	 * Người chơi không còn điểm nào thì GAME OVER
	 */
	
	/**
	 * Đây là hàm random 1 số bất kỳ
	 * @param gioiHanMax là giới hạn cao nhất + 1
	 * @return 1 số bất kỳ từ 0 --> gioiHanMax
	 */
	static int soRandom(int gioiHanMax)
	{
		Random rd= new Random();
		int soRd= rd.nextInt(6);
		return soRd;
	}
	public static void main(String[] args) {
		int diem=5;
		int soMay= soRandom(6);
		
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("số máy là"+soMay);
			System.out.println("Điểm hiện tại của bạn "+diem);
			System.out.println("Số bạn đoán là: ");
			int soBanNhap= sc.nextInt();
			
			if(soBanNhap==soMay)
			{
				System.out.println("Đúng rồi =)))");
				diem++;
			}
			else if(soBanNhap!=soMay)
			{
				System.out.println("Sai rồi =(((");
				diem--;
			}
			
			if(diem==0)
			{
				System.out.println("GAME OVER!");
				break;
			}
			if(diem==10)
			{
				System.out.println("Bạn đã chiến thắng");
				break;
			}
		}
	}

}

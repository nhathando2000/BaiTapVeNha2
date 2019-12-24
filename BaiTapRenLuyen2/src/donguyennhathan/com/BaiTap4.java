package donguyennhathan.com;

import java.text.Normalizer;
import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi bất kỳ: ");
//		String str= "Đỗ Nguyễn Nhật Hàn @123";
		String str=sc.nextLine();
		int soInHoa=0;
		int soInThuong=0;
		int soChuSo=0;
		int soKyTuDacBiet=0;
		int soKhoangTrang=0;
		int soNguyenAm=0;
		int soPhuAm=0;
		for(int i=0; i<str.length();i++)
		{
			char ktuThuI=str.charAt(i);
			if(Character.isUpperCase(ktuThuI))
			{
				soInHoa++;
			}
			if(Character.isLowerCase(ktuThuI))
			{
				soInThuong++;
			}
			if(Character.isDigit(ktuThuI))
			{
				soChuSo++;
			}
			if(!Character.isLetter(ktuThuI)&&!Character.isDigit(ktuThuI)&&!Character.isSpaceChar(ktuThuI))
			{
				soKyTuDacBiet++;
			}
			if(Character.isSpaceChar(ktuThuI))
			{
				soKhoangTrang++;
			}
			/*
			 * Normalizer: Class này cung cấp các phương thức để tiêu chuẩn hóa Unicode 
			 * thành văn bản tương đương
			 * Nhằm mục đích thuận tích cho việc sắp xếp và tìm kiếm chuỗi
			 * Normalizer.normalize(s, Normalizer.Form.NFD)
			 * Tiêu chuẩn hóa chuỗi s theo định dạng NFD
			 */
			String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
			char ktKoDau= temp.charAt(i);
			switch (ktKoDau) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				soNguyenAm++;
			default:
				soPhuAm++;
			}
		}
		System.out.println("Số in hoa: "+soInHoa);
		System.out.println("Số in thường: "+soInThuong);
		System.out.println("Số chữ số: "+soChuSo);
		System.out.println("Số Ký tự đặc biệt: "+soKyTuDacBiet);
		System.out.println("Số khoảng trắng: "+soKhoangTrang);
		System.out.println("Số chữ nguyên âm: "+soNguyenAm);
		System.out.println("Số chữ phụ âm: "+soPhuAm);
	}

}

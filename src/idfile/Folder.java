package idfile;



import java.io.File;
import java.util.Scanner;

public class Folder {
public Folder() {
	Scanner n = new Scanner(System.in);
	System.out.println(" nhap file muon biet do lon: ");
	String path = n.nextLine();
	File file = new File(path);
	if(file.exists()== true ) {
		System.out.println("true");
		System.out.println("ten file:" +file.getName());
		System.err.println("do lon la: " + file.length()+ " byte")	;
		System.out.println("co muon xoa file"+ file.getName() );
		System.out.println("1. có ");
		System.out.println("2. không");
		System.out.println(" nhap lua chon: ");
		int lc =n.nextInt();
		if(lc ==1 ) {
			file.delete();
			System.out.println(" xoa file thanh cong");
			
		}else
			System.out.println(" ban muon gui nguyen file....");
		}
	else
		System.out.println("false");
	
	
}
public static void main(String[] args) {
	new Folder();
}
}

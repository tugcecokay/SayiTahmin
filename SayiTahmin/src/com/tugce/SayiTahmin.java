package com.tugce;

import java.util.Scanner;

public class SayiTahmin {
	public static void main(String[] args) {
		int sayac = 0;
		int gsayi = 0;// kullanıcıdan 1 ve 2 sayılarını alacağımız int değeri
		int baslangic = 50;
		int altlimit = 1;
		int üstlimit = 100;
		Scanner girdi = new Scanner(System.in);
		System.out.println("***SAYI TAHMİN OYUNU***");
		System.out.println("Aklından bir sayı tut(1-100) :)");
		System.out.println("Tahmin ettiğimden büyük bir sayı ise '2',daha küçük ise '1', bildiysem '0'ı tuşla:) ");

		do {
			System.out.println("Tuttuğun sayı..." + baslangic + "!");// kullanıcıya
																		// ilk
																		// olarak
																		// 50
																		// sayısını
																		// sunar

			try {
				gsayi = girdi.nextInt();
			} catch (Exception e) {
				System.out.println("Lütfen belirtilen tuşları kullanınız !");
				main(args);
			}

			if (gsayi == 1 || gsayi == 0 || gsayi == 2) {

				if (gsayi == 1) {// eğer kullanıcı 1'e basarsa tutulan sayı
									// 50den küçüktür
					üstlimit = baslangic;// üst limit başlangıç limitine
											// eşitlenir
					baslangic = (altlimit + üstlimit) / 2;// sayı bulunana kadar
															// bu işlem yapılır.
				} else if (gsayi == 2) {// eğer kullanıcı 2'e basarsa tutulan
										// sayı 50'den büyüktür
					altlimit = baslangic;
					baslangic = (altlimit + üstlimit) / 2;
				}
				sayac++;
				
			} 
			else {
				System.out.println("Yanlış tuşlama yaptınız!");
				System.exit(-1);
			}
		} while (gsayi != 0);// kullanıcı 0'a basarsa bilgisayar kullanıcının
								// tuttuğu sayıyı bilidiği anlamına gelir.
		System.out.println(sayac + " denemede buldum :)");// sayaç

	}

}

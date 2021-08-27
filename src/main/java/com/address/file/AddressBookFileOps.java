package com.address.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookFileOps{
	
public static void write(String s, File f) throws IOException
{
		FileWriter fw = new FileWriter(f,true);
		fw.write(s);
		fw.close();
	}

	public static void main(String[] args) {
		try {
			File f = new File("src\\main\\resources\\AddressBookDetails.txt");
			write("Name: Arun, Mobno. : 9606557704, Address: Solapur,MH", f);
		} catch (IOException e) {
		}

	}
}

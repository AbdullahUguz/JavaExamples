<<<<<<< HEAD
package com.cetin.i2i.file.operation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.filechooser.FileSystemView;

/* @author mehmetalicetin88
*/

public class BufferedReaderOperation {

  public static final String STOP = "STOP";
  public static final char   C_STOP='q';

  public static void extractedReadLineString() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String s;

    System.out.println("Enter 'stop' to quit.");
    try {
      do {
        s = bufferedReader.readLine();
        System.out.println("Entered String :" + s);
      } while (!s.equalsIgnoreCase(STOP));

    } catch (IOException e) {
      System.err.println("Occur an error as inputStream " + e.getMessage());
    }
  }

  public static void extractedReadCharacter() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    char c;

    System.out.println("Enter a keyword !!");
    try {
      do {
        c = (char) bufferedReader.read();
        System.out.println(c);
      } while (c != C_STOP);

    } catch (IOException e) {
      // TODO: handle exception
    }
  }

  /**
   * @return
   * @throws IOException
   */
  public static String[] saveKeywords() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[10];
    int count = 0;
    System.out.println("Enter a string to save your list");

    while (true) {
      String st = bufferedReader.readLine();
      if (st.equalsIgnoreCase(STOP)) {
        break;
      }
      str[count] = st;
      count++;
    }
    return str;
  }

  public static void showArray(String[] str) {
    for (int i = 0; i < str.length; i++) {
      if (str[i] != null) {
        String string = str[i];
        System.out.println(string);
      }
    }
  }

 
  /**
   * 
   */
  public static void listAllDriver() {
    FileSystemView fileSystemView=FileSystemView.getFileSystemView();
    
    for(File file:File.listRoots()) {
      System.out.println("Driver : "+fileSystemView.getFileSystemView());
    }
  }

}
=======
package com.cetin.i2i.file.operation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.filechooser.FileSystemView;

/* @author mehmetalicetin698789658
*/

public class BufferedReaderOperation {

	public static final String STOP = "STOP";

	public static void extractedReadLineString() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s;

		System.out.println("Enter 'stop' to quit.");
		try {
			do {
				s = bufferedReader.readLine();
				System.out.println("Give me a String :" + s);
			} while (!s.equalsIgnoreCase(STOP));

		} catch (IOException e) {
			System.err.println("Occur an error as inputStream " + e.getMessage());
		}
	}

	public static void extractedReadCharacter() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char c;

		System.out.println("Enter a keyword !!");
		try {
			do {
				c = (char) bufferedReader.read();
				System.out.println(c);
			} while (c != 'q');

		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	/**
	 * @return
	 * @throws IOException
	 */
	public static String[] saveKeywords() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[10];
		int count = 0;
		System.out.println("Enter a string to save your list");

		while (true) {
			String st = bufferedReader.readLine();
			if (st.equalsIgnoreCase(STOP)) {
				break;
			}
			str[count] = st;
			count++;
		}
		return str;
	}

	public static void showArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null) {
				String string = str[i];
				System.out.println(string);
			}
		}
	}

	/**
	 * 
	 */
	public static void listAllDriver() {
		FileSystemView fileSystemView = FileSystemView.getFileSystemView();

		for (File file : File.listRoots()) {
			System.out.println("Driver : " + fileSystemView.getFileSystemView());
		}
	}

}
>>>>>>> Stop_1001

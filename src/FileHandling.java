import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

public class FileHandling {
	
	public static void  main(String...poo) throws IOException {
		
		InputStreamReader  isr = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(isr);  
	    System.out.println((char)br.read());
	    String str = br.readLine();
	    System.out.println(str);
		File f =  new File("poonam.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.getAbsolutePath());
	    
		File f2 =  new File("hello.txt");
		f2.mkdirs();
		File f4 = new File("count.txt");
				PrintWriter  pw =new PrintWriter(f4);
		for(int i=0;i<10;i++)
		{
			pw.print(i+" Line");
		}
		
		pw.flush();
		pw.close();
		System.out.println(f2.exists());
		f.delete();	
		System.out.println(f.exists());
		
		FileOutputStream  fos = new FileOutputStream(f);
	  String content ="I will prove myself"	;
		fos.write(content.getBytes());	
		
		File f3 = new File("poonam.properties");
		System.out.println("Parentfile"+f3.getParentFile());
		Properties p = new Properties();
		OutputStream os = new FileOutputStream(f);

		p.setProperty("Poonam", "buy lehnga");
		p.setProperty("Pankaj", "buy sherwani");
		p.store(os, "chotu didnt get thats it");
		System.out.println(f3.getCanonicalPath());
		InputStream in = new FileInputStream(f);
		in.read();
		p.load(in);
		System.out.println(p.getProperty("Chotu", "kuchnahi"));
		System.out.println();

		
		
	}

}

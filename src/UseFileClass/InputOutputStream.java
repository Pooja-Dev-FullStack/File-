package UseFileClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//****This small example uses the file streams to copy the contents of one file into another.****//

public class InputOutputStream {

	public static void main(String[] args) throws IOException {
// FileInputStream (FileOutputStream) represent an input (output) stream on a file that lives on the native file system.
		FileInputStream fileInputStream = new FileInputStream("E:\\wewe.txt");
//	You can create a file stream from the filename, a File object or a FileDescriptor object.
		File file = new File("copy.txt");
		file.createNewFile();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		int c;
		while((c= fileInputStream.read())!=-1) {
			// read() -> This method returns the next byte of data, or -1 if the end of the stream is reached.
			System.out.println(c);
			fileOutputStream.write(c);
		}
		fileInputStream.close();
		fileOutputStream.close();

	}

}

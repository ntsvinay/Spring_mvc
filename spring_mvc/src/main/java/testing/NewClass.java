package testing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

class NewClass {

	public static void main(String[] args) {

		try {
			// Execute command
			String command = "cmd / C:\\wamp64\\bin\\mysql\\mysql5.7.26\\bin\\";
			Process child = Runtime.getRuntime().exec(command);

			// Get output stream to write from it
			OutputStream out = child.getOutputStream();

			out.write("cd C:/ /r/n".getBytes());
			out.flush();
			out.write("dir /r/n".getBytes());
			out.close();
		} catch (IOException e) {
		}
	}
}
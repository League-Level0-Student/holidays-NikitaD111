import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = "3.14159265358979323";
		// for (int i = 0; i < 4; i++) {
		// System.out.println(pi.charAt(i));
		// }
		for (int i = 0; i < pi.length(); i++) {
			String a = JOptionPane.showInputDialog("Whats the next diget of pi");
			char d = pi.charAt(i);
			String e = Character.toString(d);
			if (a.equals(e)) {
				JOptionPane.showMessageDialog(null, "ok");
				System.out.println(e);
			} else {
				JOptionPane.showMessageDialog(null, "Wrong");
				System.exit(0);
			}
		}
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

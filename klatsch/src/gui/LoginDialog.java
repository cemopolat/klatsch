package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LoginDialog extends JPanel implements ActionListener {

	private static String LOGIN = "Anmelden";
	private static String CANCEL = "Abbrechen";

	// dialogs
	private JFrame controlFrame;
	private JTextField userField;
	private JPasswordField passwordField;

	public LoginDialog(JFrame f) {
		controlFrame = f;

		JComponent buttonPane = createButtonPanel();

		JPanel textPane = new JPanel(new GridBagLayout());
		GridBagConstraints bs = new GridBagConstraints();

		bs.fill = GridBagConstraints.HORIZONTAL;

		JLabel userLabel = new JLabel("Name: ");
		userLabel.setLabelFor(userField);
		bs.gridx = 0;
		bs.gridy = 0;
		bs.gridwidth = 1;
		textPane.add(userLabel, bs);

		userField = new JTextField(10);
		bs.gridx = 1;
		bs.gridy = 0;
		bs.gridwidth = 2;
		textPane.add(userField, bs);

		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setLabelFor(passwordField);
		bs.gridx = 0;
		bs.gridy = 1;
		bs.gridwidth = 1;
		textPane.add(passwordLabel, bs);

		passwordField = new JPasswordField(10);
		passwordField.setActionCommand(LOGIN);
		passwordField.addActionListener(this);
		bs.gridx = 1;
		bs.gridy = 1;
		bs.gridwidth = 2;
		textPane.add(passwordField, bs);
		add(textPane);
		add(buttonPane);
	}

	protected JComponent createButtonPanel() {
		JPanel p = new JPanel(new GridLayout(0, 1));

		JButton okButton = new JButton(LOGIN);
		JButton cancelButton = new JButton(CANCEL);

		okButton.setActionCommand(LOGIN);
		cancelButton.setActionCommand(CANCEL);
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);

		p.add(okButton);
		p.add(cancelButton);

		return p;
	}

	private static boolean checkPassword(char[] p) {
		boolean isCorrect = true;

		// TODO get user password from DB, now for tests password is klatsch
		char[] correctPassword = { 'k', 'l', 'a', 't', 's', 'c', 'h' };

		if (p.length != correctPassword.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals(p, correctPassword);
		}

		return isCorrect;
	}

	protected void resetFocus() {
		userField.requestFocusInWindow();
	}

	private static void createLoginGUI() {
		// create window
		JFrame f = new JFrame("KLATSCH");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create content pane
		final LoginDialog newContentPane = new LoginDialog(f);
		// content panes must be opaque
		newContentPane.setOpaque(true);
		f.setContentPane(newContentPane);

		// set focus on user field
		f.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				newContentPane.resetFocus();
			}
		});

		// display window
		f.pack();
		f.setSize(400, 150);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		Object[] options = { "Ja", "Nein" };

		if (LOGIN.equals(cmd)) {
			// TODO get user name from DB, now user is test

			// check for user
			String userInput = userField.getText();
			// check for password
			char[] passwordInput = passwordField.getPassword();
			if (userInput.equals("test") && checkPassword(passwordInput)) {
				JOptionPane.showMessageDialog(controlFrame, "Login success!");
				// TODO run program here
			} else {
				JOptionPane.showMessageDialog(controlFrame, "Invalid user name or/and password!", "Try again",
						JOptionPane.ERROR_MESSAGE);
			}

			// clear out password !!!
			userInput = "";
			Arrays.fill(passwordInput, '0');

			userField.selectAll();
			passwordField.selectAll();
			resetFocus();
		}
		if (CANCEL.equals(cmd)) {
			int m = JOptionPane.showOptionDialog(controlFrame, "Wirklich abbrechen?", "Abbrechen",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, null);
			if (m == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createLoginGUI();
			}
		});
	}

}

package Visual;

import javax.swing.*;
import java.awt.*;

class panelMain {
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}

class MainFrame extends JFrame {
	public MainFrame(){
		this.setBounds(300,300,700,300);
		PanelPassword panelPassword=new PanelPassword();
		this.add(panelPassword);
		this.setVisible(true);
	}
}

class PanelPassword extends JPanel {
    PanelElementos elementos=new PanelElementos();
    JButton boton=new JButton("Acceder");
    public PanelPassword(){
        this.setLayout(new BorderLayout());
        this.add(elementos, BorderLayout.CENTER);
        this.add(boton, BorderLayout.SOUTH);
    }
}

class PanelElementos extends JPanel{
    JLabel usuario, password;
    JTextField textoUser;
    JPasswordField textPass;
    public PanelElementos(){
        this.setLayout(new GridLayout(2,2));
        usuario=new JLabel("Usuario");
        password=new JLabel("Contraseña");
        textoUser=new JTextField(20);
        textPass=new JPasswordField(20);
        this.add(usuario);
        this.add(textoUser);
        this.add(password);
        this.add(textPass);
    }
}



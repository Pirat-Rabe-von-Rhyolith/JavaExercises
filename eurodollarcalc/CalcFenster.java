package eurodollarcalc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcFenster extends JFrame implements ActionListener {

    Scanner sc = new Scanner(System.in);
    private int x;
    private int y;
    private JLabel aufforderung;
    private JTextField eingabetf;
    private JLabel ausgabe;
    private double euro;
    private double usdollar;

    public CalcFenster(int x, int y) {
        this.x = x;
        this.y=y; 
        init();
    }

    private void init() {
        setTitle("Rechner Dollar-Euro");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        aufforderung=new JLabel("Bitte geben Sie den EURO-Wert in ganzen Zahlen oder in Dezimalzahlen mit Punkt ein");
        ausgabe = new JLabel(" ");

        eingabetf = new JTextField(20);
        eingabetf.setText(" ");
        add(aufforderung);
        add(eingabetf);

        JButton calculateB = new JButton("Berechne");

        calculateB.addActionListener(this);
        add(calculateB);
        
        add(ausgabe);
        setVisible(true);
        setLayout(new FlowLayout());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        euro = Double.parseDouble(eingabetf.getText());
        usdollar = Math.rint(euro * 1.14*100)/100;
        ausgabe.setText(Double.toString(usdollar) + " US-Dollar");
    }
}

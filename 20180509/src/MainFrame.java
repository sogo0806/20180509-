import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JButton jbutbig = new JButton("BIG");
    private JButton jbutsm = new JButton("SMALL");
    private JButton jbutex = new JButton("EXIT");
    private JLabel jlb = new JLabel("字");
    private int x = 12;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,600,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jbutbig.setBounds(100,100,100,100);
        jbutsm.setBounds(300,100,100,100);
        jbutex.setBounds(450,100,100,100);
        jlb.setBounds(100,300,100,100);

        add(jbutbig);
        add(jbutsm);
        add(jbutex);
        add(jlb);
        jlb.setFont(new Font(null,Font.PLAIN,x));

        jbutbig.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=3;
                jlb.setFont(new Font(null,Font.PLAIN,x));
            }
        });


        jbutsm.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=3;
                jlb.setFont(new Font(null,Font.PLAIN,x));
            }
        });

        jbutex.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

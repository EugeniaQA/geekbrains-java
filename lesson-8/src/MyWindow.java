import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);

        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);

        JButton firstButton = new JButton("Выход");
        firstButton.addActionListener(new CloseActionListener());

        JButton secondButton = new JButton("Кнопка 2");

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(secondButton);
        panel.add(firstButton);

        add(panel, BorderLayout.SOUTH);
    }
}

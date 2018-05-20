package beobachterPattern.simpleSwingExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingObservable {

    JFrame frame;
    public static void main(String[] args){
        SwingObservable swingObservable = new SwingObservable();
        swingObservable.run();
    }

    private void run(){
        frame = new JFrame("HelloWorldSwing");
        frame.setSize(400,200);
        JButton button = new JButton("I am the Subject!");
        JButton button2 = new JButton("also Subject, but with Lambda-Listener");
        button2.addActionListener(e -> System.out.println("Lambda works fine" + e.toString()));
        frame.add(button);
        frame.add(button2);
        button.addActionListener(new MyOwnActionListener());
        frame.pack();
        frame.setVisible(true);
    }

    class MyOwnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("I am the Observer. Been waiting for the subject to act to show this on the console");
        }
    }

}

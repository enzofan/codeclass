package project;
import java.awt.event.KeyListener;
import javax.swing.*;

public class frame extends JFrame implements KeyListener{
    public frame() {
        this.setSize(800, 600); //size  

        this.setLocationRelativeTo(null); //居中

        this.setVisible(true);//可見

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close

        this.setResizable(false); //視窗大小不變

        this.addKeyListener(this);

        this.setTitle("super");
    }
    
    public static void main(String[] args) {
        frame MYframe = new frame();
    }
}

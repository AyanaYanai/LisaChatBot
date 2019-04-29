import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import java.awt.Component;
2
import java.awt.event.ActionEvent;
3
import java.awt.event.ActionListener;
4
​
5
import javax.imageio.ImageIO;
6
import javax.swing.JPanel;
7
import java.awt.image.*;
8
import java.io.File;
9
import java.io.IOException;
10
import java.awt.Graphics;
11
import java.awt.Image;
12
import java.awt.color.*;
13
import javax.swing.*;
14
​
15
public class LisaRunner extends JFrame {
16
        
17
        private JTextField textbox = new JTextField();
18
        
19
        private JTextArea chat = new JTextArea();
20
        private ImageIcon bubble;
21
        public final static String PATH_PREFIX = "res/images/";
22
        protected  Image getImage(String fn) {
23
                Image img = null;
24
                fn = PATH_PREFIX+fn;
25
                try {
26
                        
27
                        img = ImageIO.read(this.getClass().getResource(fn));
28
​
29
                } catch (IOException e) {
30
                        // TODO Auto-generated catch block
31
                        e.printStackTrace();
32
                }
33
                return img;
34
        }
35
        
36
        public LisaRunner() {
37
                
38
                import java.awt.Component;
2
import java.awt.event.ActionEvent;
3
import java.awt.event.ActionListener;
4
​
5
import javax.imageio.ImageIO;
6
import javax.swing.JPanel;
7
import java.awt.image.*;
8
import java.io.File;
9
import java.io.IOException;
10
import java.awt.Graphics;
11
import java.awt.Image;
12
import java.awt.color.*;
13
import javax.swing.*;
14
​
15
public class LisaRunner extends JFrame {
16
        
17
        private JTextField textbox = new JTextField();
18
        
19
        private JTextArea chat = new JTextArea();
20
        private ImageIcon bubble;
21
        public final static String PATH_PREFIX = "res/images/";
22
        protected  Image getImage(String fn) {
23
                Image img = null;
24
                fn = PATH_PREFIX+fn;
25
                try {
26
                        
27
                        img = ImageIO.read(this.getClass().getResource(fn));
28
​
29
                } catch (IOException e) {
30
                        // TODO Auto-generated catch block
31
                        e.printStackTrace();
32
                }
33
                return img;
34
        }
35
        
36
        public LisaRunner() {
37import java.awt.Component;
2
import java.awt.event.ActionEvent;
3
import java.awt.event.ActionListener;
4
​
5
import javax.imageio.ImageIO;
6
import javax.swing.JPanel;
7
import java.awt.image.*;
8
import java.io.File;
9
import java.io.IOException;
10
import java.awt.Graphics;
11
import java.awt.Image;
12
import java.awt.color.*;
13
import javax.swing.*;
14
​
15
public class LisaRunner extends JFrame {
16
        
17
        private JTextField textbox = new JTextField();
18
        
19
        private JTextArea chat = new JTextArea();
20
        private ImageIcon bubble;
21
        public final static String PATH_PREFIX = "res/images/";
22
        protected  Image getImage(String fn) {
23
                Image img = null;
24
                fn = PATH_PREFIX+fn;
25
                try {
26
                        
27
                        img = ImageIO.read(this.getClass().getResource(fn));
28
​
29
                } catch (IOException e) {
30
                        // TODO Auto-generated catch block
31
                        e.printStackTrace();
32
                }
33
                return img;
34
        }
35
        
36
        public LisaRunner() {
37
                
38
                
39
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
40
                this.setVisible(true);
41
                this.setLayout(null);
42
                this.setSize(600,600);
43
                this.setResizable(false);
44
                this.setTitle("Chatbot Runner");
45
                JPanel panel = new JPanel() {
46
                        @Override
47
                        public void paintComponent(Graphics g) {
48
                                super.paintComponents(g);
49
                                g.drawImage(getImage("bubble.png"), 500, 200, 10, 5, null);
                
38
                
39
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
40
                this.setVisible(true);
41
                this.setLayout(null);
42
                this.setSize(600,600);
43
                this.setResizable(false);
44
                this.setTitle("Chatbot Runner");
45
                JPanel panel = new JPanel() {
46
                        @Override
47
                        public void paintComponent(Graphics g) {
48
                                super.paintComponents(g);
49
                                g.drawImage(getImage("bubble.png"), 500, 200, 10, 5, null);
39
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
40
                this.setVisible(true);
41
                this.setLayout(null);
42
                this.setSize(600,600);
43
                this.setResizable(false);
44
                this.setTitle("Chatbot Runner");
45
                JPanel panel = new JPanel() {
46
                        @Override
47
                        public void paintComponent(Graphics g) {
48
                                super.paintComponents(g);
49
                                g.drawImage(getImage("bubble.png"), 500, 200, 10, 5, null);
public class Lisa {
private ArrayList<String>catchphrases;
private ArrayList<String>responses;
private ArrayList<String> questionList;
private static int questionNum;
private String question;
private Image imgs;
public final static String PATH_PREFIX = "res/images/";
int x;
int y;

protected  Image getImage(String fn) {
	Image img = null;
	///fn = PATH_PREFIX+fn;
	try {
		
		img = ImageIO.read(this.getClass().getResource(fn));

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return img;
}

public Lisa(int ex,int why) {
	catchphrases = new ArrayList<String>();
	catchphrases.add("If anyone wants me, I'll be in my room!");
	catchphrases.add("I feel like a (second name)");
	responses= new ArrayList<String>();
	questionNum=0;
	question= "";
	questionList= new ArrayList<String>();
	imgs=getImage("lisa1.png");
	x=ex;
	y= why;
}


public String askQuestion() {
	if(questionNum<questionList.size()) {
	question= questionList.get(questionNum);
	questionNum++;
	return question;
	}
	return getThesis();
}

public String getThesis() {
	return "hi";
}

public void draw(Graphics g, int x, int y) {
	g.drawImage(imgs, x, y,null);
	this.x=x;
	this.y=y;
	
}
public void saveResponse(String s) {
	responses.add(s)

;
}

public ArrayList<String> getCatchphrasesList() {
	return catchphrases;
}

public ArrayList<String> getResponseList() {
	return responses;
}

public ArrayList<String> getQuestionList(){
	return questionList;
}
 
public int getQuestionNum() {
	return questionNum;
}


	
}

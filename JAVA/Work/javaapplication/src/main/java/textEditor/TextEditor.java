package textEditor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.*;

public class TextEditor extends JFrame{
    
    String fileName;
    TextArea content;
    MenuBar mb;
    Menu mFile;
    MenuItem miNew,miOpen,miSaveAs,miExit;
    
    TextEditor(String title){
        
        super(title);
        content = new TextArea();
        add(content);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mb =new MenuBar();
        mFile = new Menu("File");
        miNew = new MenuItem("New");
        miOpen = new MenuItem("Open");
        miSaveAs= new MenuItem("Save As...");
        miExit = new MenuItem("Exit");
        
        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(miSaveAs);
        mFile.addSeparator();
        mFile.add(miExit);
        
        mb.add(mFile);
        setMenuBar(mb);
        
        MyHandler handler = new MyHandler();
        miNew.addActionListener(handler);
        miOpen.addActionListener(handler);
        miSaveAs.addActionListener(handler);
        miExit.addActionListener(handler);
        
        setSize(600,400);
        setVisible(true);
        
    }
    
    void fileOpen(String fileName){
        FileReader fr;
        BufferedReader br;
        StringWriter sw;
        
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            sw = new StringWriter();
            
            int ch = 0;
            while ((ch=br.read())!=-1){
                sw.write(ch);
            }
            br.close();
            content.setText(sw.toString());
        } catch(IOException e){
            e.printStackTrace();
            }
    }
    
    void saveAs(String fileName){
        FileWriter fw;
        BufferedWriter bw;
        try{
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content.getText());
            bw.close();
        } catch(IOException ie){
            ie.printStackTrace();
        }
    }
    public static void main(String[] args){
        TextEditor mainWin = new TextEditor("TextEditor");
        
    }
    
    ///////////////////////////////////////////////////////////////////
    
    public class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("New")){
                content.setText("");
                
            }
            else if(command.equals("Open")){
                FileDialog fileOpen = new FileDialog(TextEditor.this,"파일열기");
                fileOpen.setVisible(true);
                fileName = fileOpen.getDirectory()+fileOpen.getFile();
                System.out.println(fileName);
                fileOpen(fileName);
            }
            else if(command.equals("Save As...")){
                
                FileDialog fileSave =new FileDialog(TextEditor.this,"파일저장",FileDialog.SAVE);
                fileSave.setVisible(true);
                fileName = fileSave.getDirectory()+fileSave.getFile();
                System.out.println(fileName);
                saveAs(fileName);
            }
            else if(command.equals("Exit")){
                System.exit(0);
            }
        }
        
    }

    
    
       

}



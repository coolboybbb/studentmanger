package DAO;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;
/**
 *
 * @author zzb
 * @version 2020.0705
 *
 */
public class addContact {

    public void addblacklist(String newName)
    {
        try {
            String name= null;//拆分的名字
            String record;
            int index=0;
            boolean found =false;
            File file= new File("blacklist.text");
            RandomAccessFile raf=new RandomAccessFile(file,"rw");
            while(raf.getFilePointer()<raf.length())
            {
                record=raf.readLine();
                //index=record.indexOf("!");
                name=record.substring(0, 3);

                if(name.equals(newName))
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                record =newName+"!";
                raf.writeBytes(record);
                raf.writeBytes(System.lineSeparator());
                raf.close();//关闭资源
                JOptionPane.showMessageDialog(null, "添加成功");
            }else {
                raf.close();
                JOptionPane.showMessageDialog(null, "用户已存在");

            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean panduanblacklist(String uersname)
    {
        String name= null;//拆分的名字
        String record;
        //int index=0;
        boolean found =false;
        File file= new File("blacklist.text");
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile(file,"rw");
            try {
                while(raf.getFilePointer()<raf.length())
                {
                    record=raf.readLine();

                    name=record.substring(0, 3);

                    if(name.equals(uersname))
                    {
                        found=true;
                        break;
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return found;
    }

    /**
     * 删除黑名单中的学生
     * @param uersname
     */
    public void delete(String uersname)
    {
        try {
            String name= null;//拆分的名字
            String record;
            int index=0;
            boolean found =false;
            File file= new File("blacklist.text");
            RandomAccessFile raf=new RandomAccessFile(file,"rw");
            while(raf.getFilePointer()<raf.length())
            {

                record=raf.readLine();
                index=record.indexOf("!");
                name=record.substring(0,index);
                if(name.equals(uersname))
                {
                    found=true;
                    System.out.println("成功找到");
                    break;
                }
            }
            if(found==true)
            {//存在则删除

                File tmpFile= new File("temp.txt");//临时文件
                RandomAccessFile tmpraf=new RandomAccessFile(tmpFile,"rw");
                raf.seek(0);
                while(raf.getFilePointer()<raf.length())
                {
                    record=raf.readLine();
                    //index=record.indexOf("!");
                    //if(index==-1)continue;
                    name=record.substring(0, 3);
                    if(name.equals(uersname))
                    {
                        continue;
                    }
                    tmpraf.writeBytes(record);
                    tmpraf.writeBytes(System.lineSeparator());
                }
                raf.seek(0);//指针复位
                tmpraf.seek(0);
                while(tmpraf.getFilePointer()<tmpraf.length())
                {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                raf.setLength(tmpraf.length());
                raf.close();
                tmpraf.close();
                tmpFile.delete();
                JOptionPane.showMessageDialog(null, "删除成功！");
            }else {
                raf.close();
                JOptionPane.showMessageDialog(null, "未找到待删记录");
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * 查询学生是否为黑名单中
     * @param newName
     */
    public void lookblacklist(String newName)
    {
        try {
            String name= null;//拆分的名字
            String record;
            int index=0;
            boolean found =false;
            File file= new File("blacklist.text");
            RandomAccessFile raf=new RandomAccessFile(file,"rw");
            while(raf.getFilePointer()<raf.length())
            {
                record=raf.readLine();
                index=record.indexOf("!");
                name=record.substring(0, index);

                if(name.equals(newName))
                {
                    found=true;
                    JOptionPane.showMessageDialog(null, "该学生在黑名单中！");
                    break;
                }
            }
            if(found==false)
            {

                JOptionPane.showMessageDialog(null, "该学生不在黑名单中！");
                raf.close();
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void add(String newName)
    {
        try {
            String name= null;//拆分的名字
            String record;
            int index=0;
            boolean found =false;
            File file= new File("blacklist.text");
            RandomAccessFile raf=new RandomAccessFile(file,"rw");
            while(raf.getFilePointer()<raf.length())
            {
                record=raf.readLine();
                index=record.indexOf("!");
                name=record.substring(0, index);

                if(name.equals(newName))
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                record =newName+"!";
                raf.writeBytes(record);
                raf.writeBytes(System.lineSeparator());
                raf.close();//关闭资源
            }else {
                raf.close();


            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

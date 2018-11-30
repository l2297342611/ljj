package com.neusoft.lj.web.code;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkcode.do")
public class CheckCode extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        resp.setHeader("Pragma","No_cache");
        resp.setHeader("Cache-Control", "No-cache");
        resp.setDateHeader("Expires", 0);

        resp.setContentType("image/jpeg");

        int width=86,height=32;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        Graphics2D g2d = (Graphics2D)g;

        Random random=new Random();
        Font mfont=new Font("楷体",Font.BOLD,20);

        g.setFont(mfont);
        g.setColor(getRandColor(200,250));
        g.fillRect(0, 0, width, height);
        //g.setColor(getRandColor(180,200));

        for(int i=0;i<100;i++){
            int x=random.nextInt(width-1);
            int y=random.nextInt(height-1);
            int x1=random.nextInt(6)+1;
            int y1=random.nextInt(12)+1;
            BasicStroke bs=new BasicStroke(2f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);	//定制线条样式
            Line2D line=new Line2D.Double(x,y,x+x1,y+y1);
            g2d.setStroke(bs);
            g2d.draw(line);		//绘制直线
        }


        //输出由英文，数字，和中文随机组成的验证文字，具体的组合方式根据生成随机数确定。
        String sRand="";
        String ctmp="";
        int itmp=0;
        //制定输出的验证码为四位
        for(int i=0;i<4;i++){
            switch(random.nextInt(3)){
                case 1:		//生成A-Z的字母
                    itmp=random.nextInt(26)+65;
                    ctmp=String.valueOf((char)itmp);
                    break;
                case 2:		//生成a-z的字母
                    itmp=random.nextInt(26)+97;
                    ctmp=String.valueOf((char)itmp);
                    break;
                /*case 2:		//生成汉字
                    String[] rBase={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
                    //生成第一位区码
                    int r1=random.nextInt(3)+11;
                    String str_r1=rBase[r1];
                    //生成第二位区码
                    int r2;
                    if(r1==13){
                        r2=random.nextInt(7);
                    }else{
                        r2=random.nextInt(16);
                    }
                    String str_r2=rBase[r2];
                    //生成第一位位码
                    int r3=random.nextInt(6)+10;
                    String str_r3=rBase[r3];
                    //生成第二位位码
                    int r4;
                    if(r3==10){
                        r4=random.nextInt(15)+1;
                    }else if(r3==15){
                        r4=random.nextInt(15);
                    }else{
                        r4=random.nextInt(16);
                    }
                    String str_r4=rBase[r4];
                    //将生成的机内码转换为汉字
                    byte[] bytes=new byte[2];
                    //将生成的区码保存到字节数组的第一个元素中
                    String str_12=str_r1+str_r2;
                    int tempLow=Integer.parseInt(str_12, 16);
                    bytes[0]=(byte) tempLow;
                    //将生成的位码保存到字节数组的第二个元素中
                    String str_34=str_r3+str_r4;
                    int tempHigh=Integer.parseInt(str_34, 16);
                    bytes[1]=(byte)tempHigh;
                    ctmp=new String(bytes);
                    break;*/
                default:
                    itmp=random.nextInt(10)+48;
                    ctmp=String.valueOf((char)itmp);
                    break;
            }
            sRand+=ctmp;
            Color color=new Color(20+random.nextInt(110),20+random.nextInt(110),random.nextInt(110));
            g.setColor(color);
            //将生成的随机数进行随机缩放并旋转制定角度 PS.建议不要对文字进行缩放与旋转,因为这样图片可能不正常显示
            /*将文字旋转制定角度*/
            Graphics2D g2d_word=(Graphics2D)g;
            AffineTransform trans=new AffineTransform();
            trans.rotate((45)*3.14/180,15*i+8,7);
            /*缩放文字*/
            float scaleSize=random.nextFloat()+0.8f;
            if(scaleSize>1f) scaleSize=1f;
            trans.scale(scaleSize, scaleSize);
            g2d_word.setTransform(trans);
            g.drawString(ctmp, 15*i+18, 14);
        }
        HttpSession session=req.getSession(true);
        session.setAttribute("checkCode", sRand);
        g.dispose();	//释放g所占用的系统资源
        ImageIO.write(image,"JPEG",resp.getOutputStream());	//输出图片
    }




    private Color getRandColor(int e, int s) {
        Random random=new Random ();
        if(s>255) s=255;
        if(e>255) e=255;
        int r,g,b;
        r=s-random.nextInt(s-e);	//随机生成RGB颜色中的r值
        g=s-random.nextInt(s-e);	//随机生成RGB颜色中的g值
        b=s-random.nextInt(s-e);	//随机生成RGB颜色中的b值
        return new Color(r,g,b);
    }
}

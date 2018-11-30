package com.neusoft.lj.web.mail;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil implements Runnable{

    private String mail;
    private String checkCode;
    private String account;

    public MailUtil(String mail,String checkCode,String account){
        this.mail = mail;
        this.checkCode = checkCode;
        this.account = account;
    }

    String from = "2297342611@qq.com";
    String host = "smtp.qq.com";


    @Override
    public void run() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        properties.setProperty("mail.smtp.auth","true");

        try {
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);

            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("2297342611@qq.com","lblbyerialpgdidd");
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(mail));
            message.setSubject("账号激活");
            String content = "<html><head></head><body><h1>这是一封激活邮件,激活请点击以下链接</h1><h3><a href='http://10.25.200.52:8899/active.do?codes="
                    + checkCode + "&account=" +account+ "'>http://10.25.200.52:8899/active.do?codes=" + checkCode + "&account=" +account
                    + "</href></h3></body></html>";
            message.setContent(content,"text/html;charset=utf-8");
            Transport.send(message);
            System.out.println("邮件发送成功");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

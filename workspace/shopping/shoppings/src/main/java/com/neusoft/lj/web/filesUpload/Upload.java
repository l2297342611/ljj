package com.neusoft.lj.web.filesUpload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@WebServlet("/upload.do")
public class Upload extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String savePath = this.getServletContext().getRealPath("/img");
        String tempPath = this.getServletContext().getRealPath("/tempFiles");
        File tempFile = new File(tempPath);
        if(!tempFile.exists()){
            tempFile.mkdir();
        }

        String errorMessage = "";
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(1024*100);
        factory.setRepository(tempFile);
        ServletFileUpload sfu = new ServletFileUpload(factory);

        sfu.setHeaderEncoding("utf-8");

        if(!ServletFileUpload.isMultipartContent(req)){
            return;
        }

        sfu.setFileSizeMax(1024*1024);
        sfu.setSizeMax(1024*1024*10);

        try {
            List<FileItem> items = sfu.parseRequest(req);
            Iterator<FileItem> iterator = items.iterator();
            while (iterator.hasNext()){
                FileItem item = iterator.next();

                if(item.isFormField()){
                    errorMessage = "请提交文件！";
                    break;
                }else{
                    String fileName = item.getName();
                    if(fileName==null || fileName.trim()==""){
                        System.out.println("文件名为空");
                    }
                    System.out.println(fileName);
                    //fileName = fileName.substring(fileName.lastIndexOf("\\"+1));
                    String name = fileName.substring(0,fileName.lastIndexOf("."));
                    String fileExtension = fileName.substring(fileName.lastIndexOf("."));

                    if(!validExtension(fileExtension)){
                        errorMessage = "上传文件非法";
                        item.delete();
                        break;

                    }
                    fileName = name + new Date().getTime() + fileExtension;

                    InputStream in = item.getInputStream();
                    //String realFileName = createFlieName(fileName);
                    //String realFilePath = createFilePath(savePath,realFileName);
                    String realSavaPath = savePath+"\\"+fileName;
                    System.out.println(fileName);
                    req.setAttribute("path",fileName);
                    File file1 = new File(realSavaPath);
                    FileOutputStream out = new FileOutputStream(file1);

                    byte buf[] = new byte[1024];
                    int len = 0;
                    while ((len = in.read(buf))>0){
                        out.write(buf,0,len);
                    }

                    in.close();
                    out.close();
                    item.delete();


                }
            }
        }catch (FileUploadBase.FileSizeLimitExceededException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "单个文件超出最大值！！！");
            req.getRequestDispatcher("upload.jsp").forward(req, resp);
            return;
        } catch (FileUploadBase.SizeLimitExceededException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "上传文件的总的大小超出限制的最大值！！！");
            req.getRequestDispatcher("upload.jsp").forward(req, resp);
            return;
        } catch (FileUploadException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "文件上传失败！！！");
            req.getRequestDispatcher("upload.jsp").forward(req, resp);
            return;
        }

        req.setAttribute("errorMessage",errorMessage);
        req.getRequestDispatcher("upload.jsp").forward(req,resp);
    }

    private boolean validExtension(String fileExtension) {
        return true;
    }

    /*private String createFilePath(String savePath, String realFileName) {
        Calendar today = Calendar.getInstance();
        String year = String.valueOf(today.get(Calendar.YEAR));
        String month = String.valueOf(today.get(Calendar.MONTH) + 1);


        String upPath = savePath + File.separator + year + File.separator + month + File.separator;
        File uploadFolder = new File(upPath);
        if (!uploadFolder.exists()) {
            uploadFolder.mkdirs();
        }

        String realFilePath = upPath + realFileName;

        return realFilePath;
    }*/

    private String makePath(String filename,String savePath){
        
    }

    private String createFlieName(String fileName) {
        return UUID.randomUUID().toString() + "_" + fileName;
    }
}



package com.ecommerce.Controller_Servlets;

import com.ecommerce.DAO_DataAccessObject.ProductDAO;
import com.ecommerce.DAO_DataAccessObject.UserDAO;
import com.ecommerce.Model.ProductTable;
import com.ecommerce.Model.UserTable;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet(name = "AddProductsServlet", value = "/AddProductsServlet")
@MultipartConfig
public class AddProductsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String pName = request.getParameter("productName");
        String pCategory = request.getParameter("productCategory");
        int pPrice = Integer.parseInt(request.getParameter("productPrice"));
        Part pImage = request.getPart("productImage");
        String filePath = uploadImage(pImage);
        String localFilePath = "image/ProductImage/"+pImage.getSubmittedFileName();
        ProductDAO productDAO = new ProductDAO();
        ProductTable productTable = productDAO.addProduct(pName, pCategory, pPrice, localFilePath);
        if (productTable != null) {
            response.sendRedirect("index.jsp");
        } else {
            out.println("Can't add products");
        }
    }

    private String uploadImage(Part pImage) {
        String pImageName = pImage.getSubmittedFileName();
        String pImageUploadPath = "H:/2. Java_Learn/_Servlet_and_JSP/1_EcommerceJDBC/src/main/webapp/image/ProductImage/"+pImageName;
        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(pImageUploadPath);
//            InputStream inputStream = pImage.getInputStream();
/*            byte[] data = new byte[inputStream.available()];
            inputStream.read();
            fileOutputStream.write(data);
            fileOutputStream.close();*/
//            Files.copy(inputStream, Paths.get(pImageUploadPath));

            FileOutputStream fos=new FileOutputStream(pImageUploadPath);
            FileInputStream fis=(FileInputStream) pImage.getInputStream();

            byte[]data=new byte[fis.available()];
            fis.read(data);
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pImageUploadPath;
    }
}

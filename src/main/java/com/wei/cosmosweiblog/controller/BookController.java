package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Book;
import com.wei.cosmosweiblog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/toBookList")
    public String toBookList(Model model) {
        List<Book> bookList = bookService.queryAllBook();
        model.addAttribute("bookList", bookList);
        return "book-list";
    }

    @RequestMapping("/toUpload")
    public String toUpload() {
        return "bookUpload";
    }

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file,
                         HttpServletRequest servletRequest) throws IOException {

        String uploadFileName = file.getOriginalFilename();
        if (uploadFileName == null) {
            return "error";
        }

//        System.out.println(System.getProperty("user.dir"));

//        System.out.println(uploadFileName);
//        System.out.println(servletRequest.getServletContext());
//        String path =servletRequest.getServletContext().getRealPath("/upload");
        String path = System.getProperty("user.dir") + "/upload/";
//        System.out.println(path);

        File realPath = new File(path);
//        System.out.println(realPath);

        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("文件保存的地址：" + realPath);

        InputStream inputStream = file.getInputStream();
        OutputStream outputStream = new FileOutputStream(new File(realPath, uploadFileName));

        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();

        return "ok";
    }


//    @ResponseBody
//    @RequestMapping("/download0")
//    public String download0(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String path = System.getProperty("user.dir") + "/upload/";
//        System.out.println("目标地址+" + path);
//
//        String fileName = "1000道 互联网Java工程师面试题.pdf";
//        response.reset();
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("multipart/form-data");
//        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
//
//        File file = new File(path, fileName);
//
//        InputStream inputStream = new FileInputStream(file);
//
//        OutputStream outputStream = response.getOutputStream();
//
//        byte[] buffer = new byte[1024];
//        int index = 0;
//
//        while ((index = inputStream.read(buffer)) != -1) {
//            outputStream.write(buffer, 0, index);
//            outputStream.flush();
//        }
//        outputStream.close();
//        inputStream.close();
//        return "ok0";
//    }

    @ResponseBody
    @RequestMapping("/download/{id}")
    public String download(HttpServletRequest request, HttpServletResponse response, @PathVariable Integer id) throws IOException {

        Book book = bookService.queryById(id);

        String path = book.getPath();

        String fileName = book.getTitle() + ".pdf";
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(path, fileName);

        InputStream inputStream = new FileInputStream(file);

        OutputStream outputStream = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int index = 0;

        while ((index = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, index);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        return "ok";
    }

    @RequestMapping("/toSearchBook")
    public String toSearchBook(String search, Model model) {
        List<Book> bookList = bookService.searchBookByTitle(search);
        model.addAttribute("bookList", bookList);
        return "book-list";
    }
}

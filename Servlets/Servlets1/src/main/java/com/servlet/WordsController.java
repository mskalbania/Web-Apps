package com.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.word.WordsResponse;
import com.word.WordsService;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

//Returning JSON with letters count and words count
@WebServlet(name = "WordsServlet", value = "/count")
public class WordsController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String input = IOUtils.toString(req.getInputStream(), "UTF-8");
        WordsService ws = new WordsService(input);
        WordsResponse response = new WordsResponse(ws.countLetters(), ws.countWords());
        resp.getWriter().print(mapper.writeValueAsString(response));
    }
}

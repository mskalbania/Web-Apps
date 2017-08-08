package com.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.word.WordsResponse;
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
        int words = input.split(" ").length;
        int letters = Arrays
                .stream(input.split(" "))
                .reduce(0, (sum, word) -> sum += word.length(), (sum1, sum2) -> sum1 + sum2);

        WordsResponse response = new WordsResponse(letters, words);
        resp.getWriter().print(mapper.writeValueAsString(response));
    }
}

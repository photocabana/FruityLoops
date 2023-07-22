package com.fiskrindy.fruityLoops.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fiskrindy.fruityLoops.Models.ItemModel;

@Controller
public class ItemController {
 
 @RequestMapping("/")
 public String index(Model model) {
     
     ArrayList<ItemModel> fruits = new ArrayList<ItemModel>();
     fruits.add(new ItemModel("Kiwi", 1.5));
     fruits.add(new ItemModel("Mango", 2.0));
     fruits.add(new ItemModel("Goji Berries", 4.0));
     fruits.add(new ItemModel("Guava", .75));
     
    model.addAttribute("fruits", fruits);
     
     return "index.jsp";
 }
}


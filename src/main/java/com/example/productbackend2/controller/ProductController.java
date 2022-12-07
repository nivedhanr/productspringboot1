package com.example.productbackend2.controller;

import com.example.productbackend2.dao.ProductDao;
import com.example.productbackend2.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Productadd(@RequestBody Products p){
        System.out.println(p.getProductcode());
        System.out.println(p.getProductname().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getMandate().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getPrice().toString());
        System.out.println(p.getSellername().toString());
        System.out.println(p.getDistributor().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Products> Productview(){
        return (List<Products>) dao.findAll();
    }
}

package com.team.iot.test.controller;

import com.google.gson.Gson;
import com.team.iot.test.Mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(produces = "application/json;charset=UTF-8")
public class OrderController {

    @Autowired
    OrderMapper orderMapper;

    Gson gson = new Gson();
    @RequestMapping("/addorder")
    public String addOrder(int id , String name, String code){
        order order = new order(id, name, code);
        int i = orderMapper.addOrder(order);
        return i+"";
    }

    @RequestMapping("/orderlist")
    public String orderList(){
        List<order> orders = orderMapper.queryOrderList();
        return gson.toJson(orders);
    }

    @RequestMapping("/queryorderbyid")
    public String queryOrderById(int id){
        order order = orderMapper.queryOrderById(id);
        return gson.toJson(order);
    }

    @RequestMapping("/deleteorder")
    public String deleteOrder(String name){
        int i = orderMapper.deleteOrder(name);
        return i+"";
    }
    @RequestMapping("/updateOrder")
    public String updateOrder(int id,String name,String code){
        order order = new order(id, name, code);
        int i = orderMapper.updateOrder(order);
        return i+"";
    }
}

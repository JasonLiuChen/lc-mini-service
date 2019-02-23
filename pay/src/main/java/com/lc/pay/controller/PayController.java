/**
 * 
 */
/**
 * Created By 刘辰
 *
 */
package com.lc.pay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lc.pay.bean.PayDetail;

@RestController
@RequestMapping("/pay")
public class PayController{
	
	@PostMapping("/createPay")
	public Object createPay(@RequestBody PayDetail payDetail) {
		return null;
	};
	
}